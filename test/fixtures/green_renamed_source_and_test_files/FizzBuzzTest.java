import org.junit.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;

// Nothing here is named DeepThought. The start-point's own .java files carry a
// filename_extension the manifest lists, so they are the learner's to replace
// and only the files in this dir reach the sandbox.
public class FizzBuzzTest {
    @Rule public JUnitRuleMockery context = new JUnitRuleMockery();

    FizzBuzzSpeaker speaker = context.mock(FizzBuzzSpeaker.class);
    FizzBuzz fizzBuzz = new FizzBuzz(speaker);

    @Test
    public void three_is_fizz() throws Exception {
        context.checking(new Expectations() {{
            oneOf(speaker).say("Fizz");
        }});
        fizzBuzz.announce(3);
    }
}
