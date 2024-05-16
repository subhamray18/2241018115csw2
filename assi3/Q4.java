
    
    import java.util.LinkedList;
    import java.util.Scanner;
     class StudentApp {
    public static void main(String[] args) {
    LinkedList<Student> studentList = new LinkedList<>();
    studentList.add(new Student("John", 20, 80));
    studentList.add(new Student("Jane", 22, 90));
    studentList.add(new Student("Doe", 23, 70));
    System.out.println("Initial Student List:");
    for (Student student : studentList) {
    System.out.println(student);
    }
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nEnter a Student object (name age mark): ");
    String input = scanner.nextLine();
    String[] parts = input.split(" ");
    Student inputStudent = new Student(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
    System.out.println("Search by reference: " + studentList.contains(inputStudent));
    studentList.remove(inputStudent);
    System.out.println("\nNumber of Students in the list: " + studentList.size());
    System.out.println("\nUpdated Student List:");
    for (Student student : studentList) {
    System.out.println(student);
    }
    }
    }
     class Student {
        private String name;
        private int age;
        private int mark;
        public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        }
        public String getName() {
        return name;
        }
        public void setName(String name) {
        this.name = name;
        }
        public int getAge() {
        return age;
        }
        public void setAge(int age) {
        this.age = age;
        }
        public int getMark() {
        return mark;
        }
        public void setMark(int mark) {
        this.mark = mark;
        }
        public boolean equals(Object obj) {
        if (obj == null) {
        return false;
       }
        if (getClass() != obj.getClass()) {
        return false;
        }
        Student other = (Student) obj;
        if (age != other.age) {
        return false;
        }
        if (mark != other.mark) {
        return false;
        }
        if (!name.equals(other.name)) {
        return false;
        }
        return true;
        }
        public String toString() {
        return String.format("Student [name=%s, age=%d, mark=%d]", name, age, mark);
        }
        }