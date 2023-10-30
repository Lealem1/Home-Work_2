// Student class represents a student in a college
public class Student {
    private String name;
    private int id;
    private int[] grades;
    // Constructor to initialize Student object
    public Student(String name, int id, int[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }
   '"' //getter used to get values for name,id and grades
    //getter for name
    public String getName() {
        return name;
    }
    // Getter for id
    public int getId() {
        return id;
    }
    // Getter for grades
    public int[] getGrades() {
        return grades;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    // Setter for id
    public void setId(int id) {
        this.id = id;
    }
    // Setter for student ID
    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}

