import junit.framework.TestCase;
import org.junit.Test;
//import static org.junit.jupiter.api.Assertion.*;
import org.junit.jupiter.api.Assertions;


public class MoodAnalyzerTest  {
    @Test
    public void analyzeMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String result = moodAnalyzer.analyzeMood("I am in sad mood");
        Assertions.assertEquals(result, "SAD");
    }
}