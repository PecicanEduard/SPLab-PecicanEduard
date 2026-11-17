package ro.uvt.info.designpatternslab2026.services;

import org.springframework.stereotype.Service;

@Service
public class BooksService {

    public String getAllBooks() {
        return "All books from service";
    }

    public String getBook(String id) {
        return "Book with id " + id;
    }

    public String addBook() {
        return "New book added";
    }

    public String updateBook(String id) {
        return "Book with id " + id + " updated";
    }

    public String deleteBook(String id) {
        return "Book with id " + id + " deleted";
    }
}