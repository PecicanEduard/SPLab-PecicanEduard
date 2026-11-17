package ro.uvt.info.designpatternslab2026.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.designpatternslab2026.Book;
import ro.uvt.info.designpatternslab2026.commands.*;
import ro.uvt.info.designpatternslab2026.services.BooksService;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;
    private final ExecutorService executorService = Executors.newFixedThreadPool(2);

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        Command<List<Book>> command = new GetAllBooksCommand(booksService);
        return command.execute();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        Command<Book> command = new GetBookCommand(booksService, id);
        return command.execute();
    }

    @PostMapping
    public ResponseEntity<String> createBook() {
        Command<Book> command = new AddBookCommand(booksService);

        executorService.submit(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            command.execute();
        });

        return new ResponseEntity<>("Request accepted. Processing in background...", HttpStatus.ACCEPTED);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id) {
        Command<Book> command = new UpdateBookCommand(booksService, id);
        return command.execute();
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        Command<String> command = new DeleteBookCommand(booksService, id);
        return command.execute();
    }
}