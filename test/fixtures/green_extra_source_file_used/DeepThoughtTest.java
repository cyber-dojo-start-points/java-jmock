import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;

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

    @Test
    public void the_answer_is_two_digits_long() throws Exception {
        context.checking(new Expectations() {{
            oneOf(answerSeeker).receiveDigits(2);
        }});
        deepThought.reportAnswerSize();
    }
}
