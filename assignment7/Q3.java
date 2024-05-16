import java.util.Scanner;
 class SimpleTextEditor {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
StringBuffer text = new StringBuffer();
while (true) {
System.out.println("\nSimple Text Editor Menu:");
System.out.println("1. Append a string");
System.out.println("2. Insert a string at a specified index");
System.out.println("3. Delete a portion of text between two indices");
System.out.println("4. Reverse the entire text");
System.out.println("5. Replace a portion of the text between two indices with a given string");
System.out.println("6. Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
if (choice == 1) {
System.out.print("Enter the string to append: ");
String appendString = scanner.next();
text.append(appendString);
System.out.println("Current state of the text: " + text);
System.out.println("Current capacity: " + text.capacity() + ", length: " + text.length());
} else if (choice == 2) {
System.out.print("Enter the index at which to insert the string: ");
int index = scanner.nextInt();
System.out.print("Enter the string to insert: ");
String insertString = scanner.next();
text.insert(index, insertString);
System.out.println("Current state of the text: " + text);
System.out.println("Current capacity: " + text.capacity() + ", length: " + text.length());
} else if (choice == 3) {
System.out.print("Enter the start index of the portion to delete: ");
int startIndex = scanner.nextInt();
System.out.print("Enter the end index of the portion to delete: ");
int endIndex = scanner.nextInt();
text.delete(startIndex, endIndex);
System.out.println("Current state of the text: " + text);
System.out.println("Current capacity: " + text.capacity() + ", length: " + text.length());
} else if (choice == 4) {
text.reverse();
System.out.println("Current state of the text: " + text);
System.out.println("Current capacity: " + text.capacity() + ", length: " + text.length());
} else if (choice == 5) {
System.out.print("Enter the start index of the portion to replace: ");
int startIndex = scanner.nextInt();
System.out.print("Enter the end index of the portion to replace: ");
int endIndex = scanner.nextInt();
System.out.print("Enter the string to replace with: ");
String replaceString = scanner.next();
text.replace(startIndex, endIndex, replaceString);
System.out.println("Current state of the text: " + text);
System.out.println("Current capacity: " + text.capacity() + ", length: " + text.length());
} else if (choice == 6) {
break;
} else {
System.out.println("Invalid choice. Please try again.");
}
}
scanner.close();
}
}