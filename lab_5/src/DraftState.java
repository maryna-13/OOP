// стан "Чернетка"
public class DraftState implements DocumentState {
    @Override
    public void sendToReview(DocumentContext context) {
        context.setState(new ReviewState());
        System.out.println("Документ відправлено на перевірку.");
    }

    @Override
    public void approve(DocumentContext context) {
        System.out.println("Чернетку не можна одразу затвердити.");
    }

    @Override
    public void archive(DocumentContext context) {
        System.out.println("Чернетку не можна архівувати.");
    }

    @Override
    public String getStateName() {
        return "Чернетка";
    }
}