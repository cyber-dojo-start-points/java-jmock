import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;
import static org.junit.Assert.*;

// The expectation below is written for 99 and DeepThought sends 42. jMock
// dispatches on the argument, so an invocation matching no expectation stops
// the test there rather than letting it read back a default return value.
public class DeepThoughtTest {
    @Rule public JUnitRuleMockery context = new JUnitRuleMockery();

    AnswerSeeker answerSeeker = context.mock(AnswerSeeker.class);
    DeepThought deepThought = new DeepThought(answerSeeker);

    @Test
    public void life_the_universe_and_everything() throws Exception {
        context.checking(new Expectations() {{
            oneOf(answerSeeker).receiveAnswer(99); will(returnValue(42));
        }});
        assertEquals(42, deepThought.computeForSevenMillionYears());
    }
}
