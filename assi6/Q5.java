import java.util.Scanner;
 public class Q5 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter a number:");
 double number = scanner.nextDouble();
 try {
 double result = performComplexComputation(number);
 System.out.println("Result: " + result);
 } catch (NullPointerException e) {
 System.out.println("An error occurred: " + e.getMessage());
 }
 }
 public static double performComplexComputation(double x) {
 try {
 double logValue = Math.log10(Math.abs(x));
 double trigValue = Math.sin(x) / Math.cos(x);
 double algebraicValue = Math.pow(x, 3)- 2 * Math.pow(x, 2) + x- 1;
 return logValue + trigValue + algebraicValue;
 } catch (NullPointerException e) {
 throw new NullPointerException("NullPointerException occurred during computation. Check if inputs are valid.");
 }
 }
 }