public class Main {
    public static void main(String[] args) {
        Document document = new SimpleDocument("Звіт про виконання лабораторної роботи");

        document = new EncryptedDocument(document);
        document = new CompressedDocument(document);
        document = new WatermarkedDocument(document);

        DocumentContext context = new DocumentContext(document);

        context.showInfo();

        context.sendToReview();
        context.showInfo();

        context.approve();
        context.showInfo();

        context.archive();
        context.showInfo();
    }
}