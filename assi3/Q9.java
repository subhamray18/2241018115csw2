import java.util.HashSet;
 class RepeatingIntegers {
public static void printRepeatingIntegers(int[] arr) {
HashSet<Integer> set = new HashSet<>();
HashSet<Integer> repeating = new HashSet<>();
for (int i = 0; i < arr.length; i++) {
if (!set.add(arr[i])) {
repeating.add(arr[i]);
}
}
System.out.println("Repeating integers: " + repeating);
}
public static void main(String[] args) {
int[] arr = {1, 2, 3, 4, 5, 2, 6, 7, 8, 2, 9};
printRepeatingIntegers(arr);
}
}