import junit.framework.TestCase;
import org.junit.Test;
//import static org.junit.jupiter.api.Assertion.*;
import org.junit.jupiter.api.Assertions;


public class MoodAnalyzerTest  {
    @Test
    public void analyzeHappyMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy  mood");
        String result = moodAnalyzer.analyzeMood();
        Assertions.assertEquals(result, "HAPPY");
    }
    @Test
    public void analyzeSadMood() {
        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("I am in sad  mood");
        String result = moodAnalyzer2.analyzeMood();
        Assertions.assertEquals(result, "SAD");
    }
}