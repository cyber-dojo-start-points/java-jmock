import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;

// The @BeforeClass method throws, so no test in this class is reached. JUnit 4
// counts the throw as a failure of the class and prints the same summary line
// it prints for a false assertion, which is what makes this red.
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
