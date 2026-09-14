import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;

// cyber-dojo.sh hands javac the .java files beside it and no others, so this
// one is never compiled and the class file the runner globs for never exists.
// It expects an answer DeepThought does not send, so a run that did reach it
// would go red and say so.
public class AnswerSizeTest {
    @Rule public JUnitRuleMockery context = new JUnitRuleMockery();

    AnswerSeeker answerSeeker = context.mock(AnswerSeeker.class);
    DeepThought deepThought = new DeepThought(answerSeeker);

    @Test
    public void the_answer_is_nine_hundred() throws Exception {
        context.checking(new Expectations() {{
            oneOf(answerSeeker).receiveAnswer(900);
        }});
        deepThought.computeForSevenMillionYears();
    }
}
