// Teacher class represents a teacher in a college
public class Teacher {
    private String name;
    private String subject;
    // Constructor to initialize Teacher object
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject =subject;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    // Setter for subject
    public void setSubject(String subject) {
        this.subject = String.valueOf(subject);
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Getter for subject
    public String getSubject() {
        return subject;
    }
}


