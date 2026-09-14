public class DeepThought {

    public DeepThought(AnswerSeeker answerSeeker) {
        this.answerSeeker = answerSeeker;
    }

    public void computeForSevenMillionYears() {
        answerSeeker.receiveAnswer(6 * 7);
    }

    public void introduce() {
        answerSeeker.receiveName("Deep Thought");
    }

    private AnswerSeeker answerSeeker;
}
