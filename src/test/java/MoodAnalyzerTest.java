import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest extends Throwable {

    @Test
    void analyzeMood()throws MoodAnalyzerTest{
        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer("I am in sad mood");
        String mood = moodAnalyzer1.analyzeMood();
        Assertions.assertEquals(mood,"SAD");
    }

    @Test
    void analyzeHappyMood()throws MoodAnalyzerTest {
        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("I am in Happy   mood".toLowerCase());
        String mood = moodAnalyzer2.analyzeMood();
        Assertions.assertEquals(mood,"HAPPY");
    }

    @Test
    void analyzeInvalidMood() throws MoodAnalyzerTest{
        MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer("null");

        String mood = moodAnalyzer3.analyzeMood();
        Assertions.assertEquals("Null" ,mood);
    }
}