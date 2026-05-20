// декоратор водяного знаку
public class WatermarkedDocument extends DocumentDecorator {
    public WatermarkedDocument(Document document) {
        super(document);
    }

    @Override
    public String getContent() {
        return document.getContent() + " [Watermark]";
    }
}