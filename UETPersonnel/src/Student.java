public class Student extends UETPersonnel {
    private String id;

    public Student(String name, int birthyear, String id) {
        super(name, birthyear);
        this.id = id;
    }
}
