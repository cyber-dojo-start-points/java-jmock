import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;

// oneOf() demands exactly one invocation. DeepThought makes none, and the rule
// checks the mockery after the test body has run, so the test body itself
// passes and the failure arrives from the rule.
public class DeepThoughtTest {
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
