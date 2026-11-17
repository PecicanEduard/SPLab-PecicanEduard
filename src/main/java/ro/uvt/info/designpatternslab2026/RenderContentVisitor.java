package ro.uvt.info.designpatternslab2026;

public class RenderContentVisitor implements Visitor {
    @Override
    public void visitBook(Book book) {
        System.out.println("Book");
    }

    @Override
    public void visitSection(Section section) {
        System.out.println("Section");
    }

    @Override
    public void visitTableOfContents(TableOfContents toc) {
        toc.print();
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraph.print();
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.print();
    }

    @Override
    public void visitImage(Image image) {
        image.print();
    }

    @Override
    public void visitTable(Table table) {
        table.print();
    }
}