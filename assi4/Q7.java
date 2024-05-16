import java.util.ArrayList;
import java.util.List;
class Course {
private String name;
public Course(String name) {
this.name = name;
}
public String getName() {
return name;
}
}
class Student {
private String name;
private List<Course> courses;
public Student(String name) {
this.name = name;
this.courses = new ArrayList<>();
}
public void enroll(Course course) {
courses.add(course);
}
public void drop(Course course) {
courses.remove(course);
}
public String getName() {
return name;
}
public List<Course> getCourses() {
return courses;
}
// Finalize method called by garbage collector
@Override
protected void finalize() throws Throwable {
System.out.println("Garbage collecting student: " + name);
}
}
 class UniversityEnrollment {
public static void main(String[] args) {
Runtime runtime = Runtime.getRuntime();
// Print initial memory usage
System.out.println("Initial total memory: " + runtime.totalMemory() + " bytes");
System.out.println("Initial free memory: " + runtime.freeMemory() + " bytes");
// Create students and enroll them in courses
Student student1 = new Student("John Doe");
Student student2 = new Student("Jane Doe");
Course course1 = new Course("Computer Science");
Course course2 = new Course("Mathematics");
student1.enroll(course1);
student1.enroll(course2);
student2.enroll(course1);
// Make students unreachable
student1 = null;
student2 = null;
// Run the garbage collector
runtime.gc();
// Print final memory usage
System.out.println("Final total memory: " + runtime.totalMemory() + " bytes");
System.out.println("Final free memory: " + runtime.freeMemory() + " bytes");
}
}
