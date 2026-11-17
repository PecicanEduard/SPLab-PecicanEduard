package ro.uvt.info.designpatternslab2026.commands;

import ro.uvt.info.designpatternslab2026.Book;
import ro.uvt.info.designpatternslab2026.services.BooksService;

public class GetBookCommand implements Command<Book> {
    private final BooksService booksService;
    private final Long id;

    public GetBookCommand(BooksService booksService, Long id) {
        this.booksService = booksService;
        this.id = id;
    }

    @Override
    public Book execute() {
        return booksService.getBook(id);
    }
}