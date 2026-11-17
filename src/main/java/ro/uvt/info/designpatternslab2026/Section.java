package ro.uvt.info.designpatternslab2026;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Section extends Element {
    private String title;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Element> children = new ArrayList<>();

    public Section() {}

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Element> getChildren() {
        return children;
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        for (Element child : children) {
            child.accept(visitor);
        }
    }
}