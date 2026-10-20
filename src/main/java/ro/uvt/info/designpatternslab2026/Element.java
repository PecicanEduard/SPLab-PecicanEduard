package ro.uvt.info.designpatternslab2026;

public abstract class Element {

    private Element parent = null;

    public Element getParent() {
        return parent;
    }

    public void setParent(Element parent) {
        this.parent = parent;
    }

    public abstract void print();
    public abstract void add(Element e);
    public abstract void remove(Element e);
    public abstract Element get(int index);
}