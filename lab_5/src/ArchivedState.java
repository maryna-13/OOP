// стан "Архівовано"
public class ArchivedState implements DocumentState {
    @Override
    public void sendToReview(DocumentContext context) {
        System.out.println("Архівований документ не можна змінювати.");
    }

    @Override
    public void approve(DocumentContext context) {
        System.out.println("Архівований документ не можна затвердити.");
    }

    @Override
    public void archive(DocumentContext context) {
        System.out.println("Документ вже знаходиться в архіві.");
    }

    @Override
    public String getStateName() {
        return "Архівовано";
    }
}