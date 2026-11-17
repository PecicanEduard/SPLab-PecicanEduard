package ro.uvt.info.designpatternslab2026;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Transient
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
    public abstract void accept(Visitor visitor);
}