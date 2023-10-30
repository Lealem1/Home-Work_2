//the import java.util.ArrayList used to import the arraylist class from the java.util package whenever we want
import java.util.ArrayList;
public class College {
    private String name;
    //Array list is used to store and manage collections of objects
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    //we use constructor to initialize name attribute and create empty arraylist objects for students and teachers attributes
    public College(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }
    //we use setter to set the values of name, students and teachers attributes
    public void setName(String name) {
        this.name = name;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
    //we use getter to retrieve the values of name, students and teachers attributes
    public String getName() {
        return name;
    }
    public ArrayList<Student> getStudents(Student student) {
        return students;
    }
    public ArrayList<Teacher> getTeachers(Teacher teacher) {
        return teachers;
    }
}