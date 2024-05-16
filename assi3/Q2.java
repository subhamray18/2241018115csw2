
    
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.List;
     class ArrayListUser {
    public static void main(String[] args) {
    List<User> userList = new ArrayList<>();
    userList.add(new User("Alice", 30));
    userList.add(new User("Bob", 25));
    userList.add(new User("Charlie", 35));
    System.out.println("Initial User List:");
    for (User user : userList) {
   System.out.println(user);
    }
    Collections.sort(userList, Comparator.comparing(User::getAge));
    System.out.println("\nSorted User List by Age:");
    for (User user : userList) {
    System.out.println(user);
    }
}
    }
     class User {
        private String name;
        private int age;
        public User(String name, int age) {
        this.name = name;
        this.age = age;
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
        public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
        }
        }
    