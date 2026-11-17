package ro.uvt.info.designpatternslab2026;

public class TableOfContents extends Element {

    @Override
    public void print() {
        System.out.println("Table of contents");
    }

    @Override
    public void add(Element e) {}

    @Override
    public void remove(Element e) {}

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}