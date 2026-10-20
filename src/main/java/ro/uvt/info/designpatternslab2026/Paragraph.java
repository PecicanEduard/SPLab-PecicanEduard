package ro.uvt.info.designpatternslab2026;

public class Paragraph extends Element {
    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
    }
    public void setAlignStrategy(AlignStrategy textAlignment) {
        this.textAlignment = textAlignment;
    }

    @Override
    public void print() {
        if (textAlignment != null) {
            textAlignment.render(text);
        } else {
            System.out.println("Paragraph: " + text);
        }
    }

    @Override
    public void add(Element e) {
    }

    @Override
    public void remove(Element e) {
    }

    @Override
    public Element get(int index) {
        return null;
    }
}