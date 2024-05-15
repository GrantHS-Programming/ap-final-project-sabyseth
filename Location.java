public class Location {
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String text;
    public Location(String opt1, String opt2, String opt3, String opt4, String locText){
        option1 = opt1;
        option2 = opt2;
        option3 = opt3;
        option4 = opt4;
        text = locText;
    }
    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    @Override
    public String toString() {
        return text;
    }
}
