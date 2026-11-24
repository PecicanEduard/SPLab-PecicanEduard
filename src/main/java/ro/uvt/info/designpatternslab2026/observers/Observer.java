package ro.uvt.info.designpatternslab2026.observers;

import ro.uvt.info.designpatternslab2026.Book;

public interface Observer {
    void update(Book book);
}