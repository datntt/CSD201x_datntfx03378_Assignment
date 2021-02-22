import java.util.Objects;

public class Person {
    private String ID, name, birthplace, dob;
    public Person() {}

    public Person(String ID, String name, String birthplace, String dob) {
        this.ID = ID;
        this.name = name;
        this.birthplace = birthplace;
        this.dob = dob;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    // display
    @Override
    public String toString() {
        return String.format("%-10s %-10s %-20s %-10s", ID,name,dob,birthplace);
    }
}
