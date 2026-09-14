import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;
import static org.hamcrest.Matchers.*;

public class AnswerSizeTest {
    @Rule public JUnitRuleMockery context = new JUnitRuleMockery();

    AnswerSeeker answerSeeker = context.mock(AnswerSeeker.class);
    DeepThought deepThought = new DeepThought(answerSeeker);

    @Test
    public void the_answer_is_two_digits_long() throws Exception {
        context.checking(new Expectations() {{
            oneOf(answerSeeker).receiveAnswer(with(greaterThan(9)))
        }});
        deepThought.computeForSevenMillionYears();
    }
}
