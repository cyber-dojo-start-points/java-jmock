import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;

// This class compiles, but cyber-dojo.sh hands JUnitCore only the class files
// matching *Test*.class and AnswerSize.class is not one of them. It expects an
// answer DeepThought does not send, so a run that did reach it would go red
// and say so.
public class AnswerSize {
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
