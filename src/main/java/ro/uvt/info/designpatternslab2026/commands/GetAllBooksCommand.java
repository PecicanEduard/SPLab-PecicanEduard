package ro.uvt.info.designpatternslab2026.commands;

import ro.uvt.info.designpatternslab2026.services.BooksService;

public class GetAllBooksCommand implements Command<String> {
    private final BooksService booksService;

    public GetAllBooksCommand(BooksService booksService) {
        this.booksService = booksService;
    }

    @Override
    public String execute() {
        return booksService.getAllBooks();
    }
}