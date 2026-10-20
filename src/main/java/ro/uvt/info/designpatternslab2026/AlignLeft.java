package ro.uvt.info.designpatternslab2026;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println(text + " +++++");
    }
}