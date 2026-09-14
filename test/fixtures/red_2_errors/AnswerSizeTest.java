import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;

// Each of the two test classes has a @BeforeClass that throws, and JUnit 4
// reports one failure per class rather than stopping at the first.
public class AnswerSizeTest {
    @Rule public JUnitRuleMockery context = new JUnitRuleMockery();

    AnswerSeeker answerSeeker = context.mock(AnswerSeeker.class);
    DeepThought deepThought = new DeepThought(answerSeeker);

    static int columns;
    static int digitsPerColumn;

    @BeforeClass
    public static void lay_out_the_answer() {
        digitsPerColumn = String.valueOf(42).length() / columns;
    }

    @Test
    public void the_answer_is_two_digits_long() throws Exception {
        context.checking(new Expectations() {{
            oneOf(answerSeeker).receiveAnswer(digitsPerColumn);
        }});
        deepThought.computeForSevenMillionYears();
    }
}
