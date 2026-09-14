import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;

// allowing() permits zero or more invocations, so the second expectation below
// is never reached and jMock still counts every expectation as satisfied. A
// stub nothing calls is what tells the two mock libraries apart: Mockito's
// strict stubbing rejects it and jMock lets it stand.
public class DeepThoughtTest {
    @Rule public JUnitRuleMockery context = new JUnitRuleMockery();

    AnswerSeeker answerSeeker = context.mock(AnswerSeeker.class);
    DeepThought deepThought = new DeepThought(answerSeeker);

    @Test
    public void life_the_universe_and_everything() throws Exception {
        context.checking(new Expectations() {{
            oneOf(answerSeeker).receiveAnswer(42);
            allowing(answerSeeker).receiveAnswer(54);
        }});
        deepThought.computeForSevenMillionYears();
    }
}
