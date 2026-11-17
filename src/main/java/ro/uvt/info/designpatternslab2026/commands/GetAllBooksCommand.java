package ro.uvt.info.designpatternslab2026.commands;

import ro.uvt.info.designpatternslab2026.Book;
import ro.uvt.info.designpatternslab2026.services.BooksService;

import java.util.List;

public class GetAllBooksCommand implements Command<List<Book>> {
    private final BooksService booksService;

    public GetAllBooksCommand(BooksService booksService) {
        this.booksService = booksService;
    }

    @Override
    public List<Book> execute() {
        return booksService.getAllBooks();
    }
}