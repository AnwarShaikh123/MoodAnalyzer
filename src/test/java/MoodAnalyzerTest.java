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
    public void analyzeSadMood1() {
        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("I am  in Sad mood ");
        String result = moodAnalyzer2.analyzeMood();
        Assertions.assertEquals(result, "SAD");
    }
    @Test
    public void analyzeNullMood2() {
        MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer(null);
        String result = moodAnalyzer3.analyzeMood();
        Assertions.assertEquals(result, "Invalid");
    }
}