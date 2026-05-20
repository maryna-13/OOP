// зберігає документ і його поточний стан
public class DocumentContext {
    private Document document;
    private DocumentState state;

    public DocumentContext(Document document) {
        this.document = document;
        this.state = new DraftState();
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void sendToReview() {
        state.sendToReview(this);
    }

    public void approve() {
        state.approve(this);
    }

    public void archive() {
        state.archive(this);
    }

    public void showInfo() {
        System.out.println("Стан документа: " + state.getStateName());
        System.out.println("Вміст документа: " + document.getContent());
    }

    public String getStateName() {
        return state.getStateName();
    }
}
