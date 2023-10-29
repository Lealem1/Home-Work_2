public class Main {
    public static void main(String[] args) {

        // Create a Student object
        Student studA= new Student("Lema Abera", 101, new int[]{25, 40, 100});
        Student studB= new Student("Hewan Abebe", 102, new int[]{58, 70, 75});

        // Create a Teacher object
        Teacher teacherX= new Teacher("Mr.Kebede Debebe", "JAVA");
        Teacher teacherY= new Teacher("Mrs.Selam Belay", "DATA BASE");

        // Create a College object
        College college = new College("CISCO college!!");

        // Add Student and Teacher objects to the College
        college.getStudents(studA);
        college.getTeachers(teacherX);
        college.getStudents(studB);
        college.getTeachers(teacherY);

        // Print out details
        System.out.println("college details");
        System.out.println("---------------------------------------------------");
           
        System.out.println();

        System.out.println("students information");
        System.out.println("---------------------------------------------------");
        System.out.println("Student 1 Id: " + studA.getId());
        System.out.println("Student 1 Grades: ");
        for (int grade : studA.getGrades()) {
            System.out.println(grade);
        }
        System.out.println("Student 2 Name: " + studB.getName());
        System.out.println("Student 2 Id: " + studB.getId());
        System.out.println("Student 2 Grades: ");
        for (int grade : studB.getGrades()) {
            System.out.println(grade);
        }
        //print out teacher information
        System.out.println("teachers information");
        System.out.println("---------------------------------------------------");
        System.out.println("Teacher 1 Name: " + teacherX.getName());
        System.out.println("Teacher 1 Subject: " + teacherX.getSubject());
        System.out.println("Teacher 2 Name: " + teacherY.getName());
        System.out.println("Teacher 2 Subject: " + teacherY.getSubject());
        }
    }