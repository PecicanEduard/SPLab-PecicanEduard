package ro.uvt.info.designpatternslab2026.commands;

import ro.uvt.info.designpatternslab2026.services.BooksService;

public class UpdateBookCommand implements Command<String> {
    private final BooksService booksService;
    private final String id;

    public UpdateBookCommand(BooksService booksService, String id) {
        this.booksService = booksService;
        this.id = id;
    }

    @Override
    public String execute() {
        return booksService.updateBook(id);
    }
}