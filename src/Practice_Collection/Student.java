package Practice_Collection;

public class Student {
    private int Rollno;
    private String Name;

    public Student(int rollno, String name) {
        this.Rollno = rollno;
        this.Name = name;
    }

    public Student() {

    }

    public void setrollno(int i) {
        this.Rollno = i;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }
}
