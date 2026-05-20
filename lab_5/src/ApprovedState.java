// стан "Затверджено"
public class ApprovedState implements DocumentState {
    @Override
    public void sendToReview(DocumentContext context) {
        System.out.println("Затверджений документ не можна повторно відправити на перевірку.");
    }

    @Override
    public void approve(DocumentContext context) {
        System.out.println("Документ вже затверджено.");
    }

    @Override
    public void archive(DocumentContext context) {
        context.setState(new ArchivedState());
        System.out.println("Документ архівовано.");
    }

    @Override
    public String getStateName() {
        return "Затверджено";
    }
}