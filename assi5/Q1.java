import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
 class Diary {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your diary entry:");
String entry = scanner.nextLine();
File diaryFile = new File("diary.txt");
if (diaryFile.exists()) {
System.out.println("The file diary.txt already exists. Please consider a different file name to avoid
overwriting previous content.");
return;
}
try (BufferedWriter writer = new BufferedWriter(new FileWriter(diaryFile))) {
writer.write(getCurrentDate());
writer.newLine();
writer.write(entry);
}
System.out.println("Your diary entry has been successfully written to diary.txt");
 catch (IOException e) {
System.err.println("Error writing to file: " + e.getMessage());
}
private static String getCurrentDate() {
return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
}
}
