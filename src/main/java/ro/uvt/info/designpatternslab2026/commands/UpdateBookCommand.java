package ro.uvt.info.designpatternslab2026.commands;

import ro.uvt.info.designpatternslab2026.Book;
import ro.uvt.info.designpatternslab2026.services.BooksService;

public class UpdateBookCommand implements Command<Book> {
    private final BooksService booksService;
    private final Long id;

    public UpdateBookCommand(BooksService booksService, Long id) {
        this.booksService = booksService;
        this.id = id;
    }

    @Override
    public Book execute() {
        return booksService.updateBook(id);
    }
}