package ro.uvt.info.designpatternslab2026;

import java.util.ArrayList;
import java.util.List;

public class Section extends Element {
    private String title;
    private List<Element> children = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element child : children) {
            child.print();
        }
    }

    @Override
    public void add(Element element) {
        if (element.getParent() != null) {
            throw new IllegalArgumentException("Acest element apartine deja altei sectiuni!");
        }
        element.setParent(this);
        children.add(element);
    }

    @Override
    public void remove(Element element) {
        children.remove(element);
        element.setParent(null);
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }
}