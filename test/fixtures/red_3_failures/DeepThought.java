public class DeepThought {

    public DeepThought(AnswerSeeker answerSeeker) {
        this.answerSeeker = answerSeeker;
    }

    public void computeForSevenMillionYears() {
        answerSeeker.receiveAnswer(6 * 900);
    }

    public void introduce() {
        answerSeeker.receiveName("Zaphod Beeblebrox");
    }

    private AnswerSeeker answerSeeker;
}
