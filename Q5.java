 class College {
    private String collegeName;
    private String collegeLoc;
    public College(String collegeName, String collegeLoc) {
    this.collegeName = collegeName;
    this.collegeLoc = collegeLoc;
    }
    public String getCollegeName() {
    return collegeName;
    }
    public void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
    }
    public String getCollegeLoc() {
    return collegeLoc;
    }
    public void setCollegeLoc(String collegeLoc) {
    this.collegeLoc = collegeLoc;
    }
    public String toString() {
    return "College [collegeName=" + collegeName + ", collegeLoc=" + collegeLoc + "]";
    }
    }
     class Student {
    private int studentId;
    private String studentName;
    private College college;
    public Student(int studentId, String studentName, College college) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.college = college;
    }
    public int getStudentId() {
    return studentId;
    }
    public void setStudentId(int studentId) {
    this.studentId = studentId;
   }
    public String getStudentName() {
    return studentName;
    }
    public void setStudentName(String studentName) {
    this.studentName = studentName;
    }
    public College getCollege() {
    return college;
    }
    public void setCollege(College college) {
    this.college = college;
    }
    public void displayStudentInfo() {
    System.out.println("Student ID: " + studentId);
    System.out.println("Student Name: " + studentName);
    System.out.println("College Name: " + college.getCollegeName());
    System.out.println("College Location: " + college.getCollegeLoc());
    }
    }
    public class Q5 {
    public static void main(String[] args) {
    College college1 = new College("MIT", "Cambridge, MA");
    College college2 = new College("Stanford", "Stanford, CA");
    Student student1 = new Student(1, "John Doe", college1);
    Student student2 = new Student(2, "Jane Doe", college2);
    System.out.println("College 1: " + college1);
    System.out.println("College 2: " + college2);
    System.out.println("\nStudent 1 Info:");
    student1.displayStudentInfo();
    System.out.println("\nStudent 2 Info:");
    student2.displayStudentInfo();
    }
    }
