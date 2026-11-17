package ro.uvt.info.designpatternslab2026.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.uvt.info.designpatternslab2026.Book;

import java.util.List;

@Component
public class BooksRepositoryAdapter implements CrudRepository<Book, Long> {

    private final BooksRepository springBooksRepository;

    @Autowired
    public BooksRepositoryAdapter(BooksRepository springBooksRepository) {
        this.springBooksRepository = springBooksRepository;
    }

    @Override
    public Book save(Book entity) {
        return springBooksRepository.save(entity);
    }

    @Override
    public Book findById(Long id) {
        return springBooksRepository.findById(id).orElse(null);
    }

    @Override
    public List<Book> findAll() {
        return springBooksRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        springBooksRepository.deleteById(id);
    }
}