public class DeepThought {

    public DeepThought(AnswerSeeker answerSeeker) {
        this.answerSeeker = answerSeeker;
    }

    public void computeForSevenMillionYears() {
        System.err.println("seven million years later");
        answerSeeker.receiveAnswer(6 * 7);
    }

    private AnswerSeeker answerSeeker;
}
