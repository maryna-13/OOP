// стан "На перевірці"
public class ReviewState implements DocumentState {
    @Override
    public void sendToReview(DocumentContext context) {
        System.out.println("Документ вже знаходиться на перевірці.");
    }

    @Override
    public void approve(DocumentContext context) {
        context.setState(new ApprovedState());
        System.out.println("Документ затверджено.");
    }

    @Override
    public void archive(DocumentContext context) {
        System.out.println("Документ на перевірці ще не можна архівувати.");
    }

    @Override
    public String getStateName() {
        return "На перевірці";
    }
}