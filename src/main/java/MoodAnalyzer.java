public class MoodAnalyzer extends Throwable {
    enum Mood{
        HAPPY, SAD, NULL,EMPTY;
    }


    private String msg;

    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }

    public String validate()throws MoodAnalyzer {
        if (msg==null) {
           return String.valueOf(Mood.NULL);
        } else if (msg.toLowerCase().contains("sad")) {
            return String.valueOf(Mood.SAD);
        } else if (msg.toLowerCase().contains("happy")) {
            return String.valueOf(Mood.HAPPY);}
            else if (msg=="") {
                return String.valueOf(Mood.EMPTY);
        } else {
            throw new MoodAnalyzer("Invalid");
        }
    }

    public String analyzeMood() {
        try {
            return validate();

        } catch (MoodAnalyzer e) {
            System.out.println("Exception " + e);
            System.out.println("catch the exception");
        }
        return msg;

    }
}


