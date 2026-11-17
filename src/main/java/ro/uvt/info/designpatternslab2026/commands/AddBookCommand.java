package ro.uvt.info.designpatternslab2026.commands;

import ro.uvt.info.designpatternslab2026.services.BooksService;

public class AddBookCommand implements Command<String> {
    private final BooksService booksService;

    public AddBookCommand(BooksService booksService) {
        this.booksService = booksService;
    }

    @Override
    public String execute() {
        return booksService.addBook();
    }
}