public class DeepThought {

    public DeepThought(AnswerSeeker answerSeeker) {
        this.answerSeeker = answerSeeker;
    }

    public int computeForSevenMillionYears() {
        return answerSeeker.receiveAnswer(6 * 7);
    }

    private AnswerSeeker answerSeeker;
}
