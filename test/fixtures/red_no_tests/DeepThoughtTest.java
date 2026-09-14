import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;

// The @Test annotation is missing, so the class holds no runnable methods.
// JUnit 4 rejects a class in that state before running anything and counts the
// rejection as a failure, which is what makes this red rather than green.
public class DeepThoughtTest {
    @Rule public JUnitRuleMockery context = new JUnitRuleMockery();

    AnswerSeeker answerSeeker = context.mock(AnswerSeeker.class);
    DeepThought deepThought = new DeepThought(answerSeeker);

    public void life_the_universe_and_everything() throws Exception {
        context.checking(new Expectations() {{
            oneOf(answerSeeker).receiveAnswer(42);
        }});
        deepThought.computeForSevenMillionYears();
    }
}
