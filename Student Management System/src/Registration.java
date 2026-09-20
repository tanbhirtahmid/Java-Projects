public class Registration {
    private Student student;
    private Course course;
    public Registration(Student student) {
        this.student = student;
    }
    public void addCourse(Course course){
        this.course = course;
        System.out.println(this.course + "\nwas added to the registration");
    }
    public Course getCourses(String id){
        return this.course;
    }

    public String toString(){
        return this.student + "\nhas" + this.course;
    }
}
