public class Student {
    private String name;
    private String id;
    private String address;
    private String hallName;

    public Student (String name, String id, String address, String hallName){
        this.name = name;
        this.id = id;
        this.address = address;
        this.hallName = hallName;
    }

    public String toString(){
        return "\nName: " + this.name + " | ID: " + this.id + " | Address: " + this.address + " | HallName: " + this.hallName;
    }
}
