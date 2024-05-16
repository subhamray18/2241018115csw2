

import java.io.File;
import java.util.Scanner;
 class DeleteFile {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the file name to delete:");
String fileName = scanner.nextLine();
File file = new File(fileName);
if (file.exists()) {
boolean isDeleted = file.delete();
if (isDeleted) {
System.out.println("File deleted successfully.");
} else {
System.err.println("Error deleting the file.");
}
} else {
System.err.println("File not found.");
}
}
}