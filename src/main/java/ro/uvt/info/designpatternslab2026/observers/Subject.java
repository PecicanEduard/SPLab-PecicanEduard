package ro.uvt.info.designpatternslab2026.observers;

import ro.uvt.info.designpatternslab2026.Book;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(Book book);
}