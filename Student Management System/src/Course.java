public class Course {
    private String code;
    private String title;
    private double creditHour;
    private String type;
    private boolean prerequisite;

    public Course(String code, String title, double creditHour, String type, boolean prerequisite){
        this.code = code;
        this.title = title;
        this.creditHour = creditHour;
        this.type = type;
        this.prerequisite = prerequisite;
    }

    public String toString(){
        return "\nCode: " + this.code + "\nTitle: " + this.title + "\nCredit: " + this.creditHour + "\nType: " + this.type;
    }
}
