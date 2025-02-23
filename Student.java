public class Student {
    String name;
    int studentId;
    String major;
    double gpa;

    public Student(String name, int studentId, String major, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}
