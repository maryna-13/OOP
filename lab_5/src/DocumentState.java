// інтерфейс стану
public interface DocumentState {
    void sendToReview(DocumentContext context);
    void approve(DocumentContext context);
    void archive(DocumentContext context);
    String getStateName();
}