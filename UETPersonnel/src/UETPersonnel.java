public class UETPersonnel {
    private String name;
    private int birthyear;
    private String studentID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * Initializer for personnel other than student.
     * @param name full name of the personnel
     * @param birthyear year of birth of the personnel
     */
    public UETPersonnel(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;
        this.studentID = null;
    }

    /**
     * Initializer for student.
     * @param name full name of the student
     * @param birthyear year of birth of the student
     * @param studentID the student's ID
     */
    public UETPersonnel(String name, int birthyear, String studentID) {
        this.name = name;
        this.birthyear = birthyear;
        this.studentID = studentID;
    }

    /**
     * Initializer to copy info from another personnel
     * @param person personnel to copy into from
     */
    public UETPersonnel(UETPersonnel person) {
        this.name = person.getName();
        this.birthyear = person.getBirthyear();
        if (person.studentID != null)this.studentID = person.getStudentID();
    }
}