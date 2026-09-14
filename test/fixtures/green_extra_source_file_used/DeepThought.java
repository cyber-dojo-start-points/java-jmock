public class DeepThought {

    public DeepThought(AnswerSeeker answerSeeker) {
        this.answerSeeker = answerSeeker;
    }

    public void computeForSevenMillionYears() {
        answerSeeker.receiveAnswer(6 * 7);
    }

    public void reportAnswerSize() {
        answerSeeker.receiveDigits(Digits.count(6 * 7));
    }

    private AnswerSeeker answerSeeker;
}
