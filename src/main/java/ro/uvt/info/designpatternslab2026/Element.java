package ro.uvt.info.designpatternslab2026;

public interface Element {
    void print();
    void add(Element e);
    void remove(Element e);
    Element get(int index);
}