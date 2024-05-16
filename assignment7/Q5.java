
import java.util.Scanner; class StringBuilderVsStringBuffer {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the base string: ");
String baseString = scanner.nextLine();
System.out.print("Enter the number of concatenations: ");
int numConcatenations = scanner.nextInt();
long startTime, endTime;
StringBuilder sb = new StringBuilder();
StringBuffer sbuf = new StringBuffer();
// Using StringBuilder
startTime = System.nanoTime();
for (int i = 0; i < numConcatenations; i++) {
sb.append(baseString);
}
endTime = System.nanoTime();
long sbTime = (endTime- startTime) / 1_000_000;
System.out.println("Using StringBuilder...");
System.out.println("Time taken: " + sbTime + " milliseconds");
System.out.println("Final string length: " + sb.length());
// Resetting StringBuilder and StringBuffer
sb = new StringBuilder();
sbuf = new StringBuffer();
// Using StringBuffer
startTime = System.nanoTime();
for (int i = 0; i < numConcatenations; i++) {
sbuf.append(baseString);
}
endTime = System.nanoTime();
long sbufTime = (endTime- startTime) / 1_000_000;
System.out.println("Using StringBuffer...");
System.out.println("Time taken: " + sbufTime + " milliseconds");
System.out.println("Final string length: " + sbuf.length());
// Comparison
long diff = sbTime- sbufTime;
System.out.println("Comparison: StringBuilder was faster than StringBuffer by " + Math.abs(diff) +
" milliseconds.");
}
}

