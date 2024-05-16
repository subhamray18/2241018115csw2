
import java.io.File;
import java.util.Scanner;
 class ListTextFiles {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the directory path:");
String directoryPath = scanner.nextLine();
File directory = new File(directoryPath);
if (!directory.exists()) {
}
System.out.println("The directory does not exist.");
return;
}
 }