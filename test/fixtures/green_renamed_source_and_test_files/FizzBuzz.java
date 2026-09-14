public class FizzBuzz {

    public FizzBuzz(FizzBuzzSpeaker speaker) {
        this.speaker = speaker;
    }

    public void announce(int n) {
        speaker.say("Fizz");
    }

    private FizzBuzzSpeaker speaker;
}
