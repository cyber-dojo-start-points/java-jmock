import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;
import static org.hamcrest.Matchers.*;

// The name holds neither Test nor Tests, so the class file this would produce
// would not match the glob cyber-dojo.sh runs. javac is handed every .java
// file beside it and stops on the missing semicolon long before that.
public class AnswerSize {
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
