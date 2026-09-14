import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;

public class DeepThoughtTest {
    @Rule public JUnitRuleMockery context = new JUnitRuleMockery();

    AnswerSeeker answerSeeker = context.mock(AnswerSeeker.class);
    DeepThought deepThought = new DeepThought(answerSeeker);

    static int hikers;
    static int answerPerHiker;

    @BeforeClass
    public static void share_out_the_answer() {
        answerPerHiker = 42 / hikers;
    }

    @Test
    public void life_the_universe_and_everything() throws Exception {
        context.checking(new Expectations() {{
            oneOf(answerSeeker).receiveAnswer(answerPerHiker);
        }});
        deepThought.computeForSevenMillionYears();
    }
}
