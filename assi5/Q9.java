
import java.io.File;
import java.util.Scanner;
 class FileMetadata {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the file name:");
String fileName = scanner.nextLine();
File file = new File(fileName);
if (!file.exists()) {
System.err.println("File not found.");
return;
}
System.out.println("File size: " + file.length() + " bytes");
System.out.println("Last modified: " + new String(file.lastModified()));
System.out.println("Readable: " + file.canRead());
System.out.println("Writable: " + file.canWrite());
System.out.println("Executable: " + file.canExecute());
System.out.println("Hidden: " + file.isHidden());
}
 }