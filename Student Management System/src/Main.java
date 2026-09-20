
public class Main {
    public static void main(String[] args) {
        Student arefin = new Student("Arefin", "2602xx", "Khulna", "Khan Jahan Ali");

        Course math = new Course("1151", "Calculus", 2.00, "NULL", false);

        Registration arefinReg = new Registration(arefin);
        arefinReg.addCourse(math);

        System.out.println(math);
        System.out.println(arefin);
        System.out.println(arefinReg);
    }
}