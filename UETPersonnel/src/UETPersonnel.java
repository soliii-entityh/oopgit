public class UETPersonnel {
    private String name;
    private int birthyear;

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

    public UETPersonnel(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;
    }

    public UETPersonnel(UETPersonnel person) {
        this.name = person.getName();
        this.birthyear = person.getBirthyear();
    }
}