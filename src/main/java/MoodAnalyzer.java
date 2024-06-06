public class MoodAnalyzer {
    String msg;
    public MoodAnalyzer(String msg){
        this.msg=msg;
    }

    public String analyzeMood() {
        try{
            if (msg.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
        catch(NullPointerException e){
        return "Hello";
        }
    }

}
