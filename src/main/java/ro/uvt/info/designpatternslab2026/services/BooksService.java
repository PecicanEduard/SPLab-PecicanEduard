package ro.uvt.info.designpatternslab2026.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.uvt.info.designpatternslab2026.Book;
import ro.uvt.info.designpatternslab2026.persistence.CrudRepository;

import java.util.List;

@Service
public class BooksService {

    private final CrudRepository<Book, Long> booksRepositoryAdapter;

    @Autowired
    public BooksService(CrudRepository<Book, Long> booksRepositoryAdapter) {
        this.booksRepositoryAdapter = booksRepositoryAdapter;
    }

    public List<Book> getAllBooks() {
        return booksRepositoryAdapter.findAll();
    }

    public Book getBook(Long id) {
        return booksRepositoryAdapter.findById(id);
    }

    public Book addBook() {
        Book book = new Book("New Generated Book");
        return booksRepositoryAdapter.save(book);
    }

    public Book updateBook(Long id) {
        Book book = booksRepositoryAdapter.findById(id);
        if (book != null) {
            return booksRepositoryAdapter.save(book);
        }
        return null;
    }

    public String deleteBook(Long id) {
        booksRepositoryAdapter.deleteById(id);
        return "Book with id " + id + " deleted";
    }
}