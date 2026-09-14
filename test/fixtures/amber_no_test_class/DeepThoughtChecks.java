import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;

// The test itself is sound, but the class name holds no "Test", and that is
// how cyber-dojo.sh finds the classes to hand JUnitCore. It is handed none,
// so it announces a clean run of nothing at all.
public class DeepThoughtChecks {
    @Rule public JUnitRuleMockery context = new JUnitRuleMockery();

    AnswerSeeker answerSeeker = context.mock(AnswerSeeker.class);
    DeepThought deepThought = new DeepThought(answerSeeker);

    @Test
    public void life_the_universe_and_everything() throws Exception {
        context.checking(new Expectations() {{
            oneOf(answerSeeker).receiveAnswer(42);
        }});
        deepThought.computeForSevenMillionYears();
    }
}
