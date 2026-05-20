// звичайний документ
public class SimpleDocument implements Document {
    private String content;

    public SimpleDocument(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}