

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 class ReadDiary {
public static void main(String[] args) {
File diaryFile = new File("diary.txt");
if (!diaryFile.exists()) {
System.out.println("The file diary.txt does not exist.");
return;
}
try (BufferedReader reader = new BufferedReader(new FileReader(diaryFile))) {
String line;
while ((line = reader.readLine()) != null) {
System.out.println(line);
}
} catch (IOException e) {
System.err.println("Error reading from file: " + e.getMessage());
}
}
}