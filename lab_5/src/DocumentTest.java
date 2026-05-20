import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testDocumentDecorators() {
        Document document = new SimpleDocument("Test document");

        document = new EncryptedDocument(document);
        document = new CompressedDocument(document);
        document = new WatermarkedDocument(document);

        String result = document.getContent();

        assertTrue(result.contains("[Encrypted]"));
        assertTrue(result.contains("[Compressed]"));
        assertTrue(result.contains("[Watermark]"));
        assertTrue(result.contains("Test document"));
    }

    @Test
    public void testInitialStateIsDraft() {
        Document document = new SimpleDocument("Test document");
        DocumentContext context = new DocumentContext(document);

        assertEquals("Чернетка", context.getStateName());
    }

    @Test
    public void testStateTransitions() {
        Document document = new SimpleDocument("Test document");
        DocumentContext context = new DocumentContext(document);

        context.sendToReview();
        assertEquals("На перевірці", context.getStateName());

        context.approve();
        assertEquals("Затверджено", context.getStateName());

        context.archive();
        assertEquals("Архівовано", context.getStateName());
    }
}