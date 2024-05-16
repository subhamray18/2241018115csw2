import java.util.*;
interface EnrollmentSystem {
void enrollStudent(Student student, Course course);
void dropStudent(Student student, Course course);
void displayEnrollmentDetails();
}
class Student {
private int id;
private String name;
public Student(int id, String name) {
this.id = id;
this.name = name;
}
public int getId() {
return id;
}
public String getName() {
return name;
}
}
class Course {
private int courseId;
private String courseName;
public Course(int courseId, String courseName) {
this.courseId = courseId;
this.courseName = courseName;
}
public int getCourseId() {
return courseId;
}
public String getCourseName() {
return courseName;
}
}
class Enrollment implements EnrollmentSystem {
private Map<Student, Set<Course>> enrollments;
public Enrollment() {
enrollments = new HashMap<>();
}
public void enrollStudent(Student student, Course course) {
enrollments.computeIfAbsent(student, k-> new HashSet<>()).add(course);
}
public void dropStudent(Student student, Course course) {
enrollments.computeIfPresent(student, (k, v)-> {
v.remove(course);
return v.isEmpty() ? null : v;
});
}
public void displayEnrollmentDetails() {
System.out.println("Enrollment Details:");
for (Map.Entry<Student, Set<Course>> entry : enrollments.entrySet()) {
Student student = entry.getKey();
Set<Course> courses = entry.getValue();
System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName());
System.out.println("Enrolled Courses:");
for (Course course : courses) {
}
}
System.out.println("Course ID: " + course.getCourseId() + ", Name: " + course.getCourseName());
System.out.println();
}
}

public class Q9 {
public static void main(String[] args) {
EnrollmentSystem enrollmentSystem = new Enrollment();
Student student1 = new Student(1, "Alice");
Student student2 = new Student(2, "Bob");
Course course1 = new Course(101, "Computer Science");
Course course2 = new Course(102, "Mathematics");
enrollmentSystem.enrollStudent(student1, course1);
enrollmentSystem.enrollStudent(student1, course2);
enrollmentSystem.enrollStudent(student2, course1);
enrollmentSystem.displayEnrollmentDetails();
enrollmentSystem.dropStudent(student1, course1);
enrollmentSystem.displayEnrollmentDetails();
}
}
