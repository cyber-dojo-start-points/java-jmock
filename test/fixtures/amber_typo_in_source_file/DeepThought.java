public class DeepThought {

    public DeepThought(AnswerSeeker answerSeeker) {
        this.answerSeeker = answerSeeker;
    }

    public void computeForSevenMillionYears() {
        answerSeeker.receiveAnswer(sixTimesSevn());
    }

    private static int sixTimesSeven() {
        return 6 * 7;
    }

    private AnswerSeeker answerSeeker;
}
