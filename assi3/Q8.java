
import java.util.HashMap;
class AnagramChecker {
public static boolean areAnagrams(String str1, String str2) {
if (str1.length() != str2.length()) {
return false;
}
HashMap<Character, Integer> charCount = new HashMap<>();
for (int i = 0; i < str1.length(); i++) {
if (charCount.containsKey(str1.charAt(i))) {
charCount.put(str1.charAt(i), charCount.get(str1.charAt(i)) + 1);
} else {
charCount.put(str1.charAt(i), 1);
}
}
for (int i = 0; i < str2.length(); i++) {
if (charCount.containsKey(str2.charAt(i))) {
charCount.put(str2.charAt(i), charCount.get(str2.charAt(i))- 1);
} else {
return false;
}
}
for (int count : charCount.values()) {
if (count != 0) {
return false;
}
}
return true;
}
public static void main(String[] args) {
String str1 = "care";
String str2 = "race";
if (areAnagrams(str1, str2)) {
    System.out.println(str1 + " and " + str2 + " are anagrams.");
}
else{
System.out.println(str1 + " and " + str2 + " are not anagrams.");}
}
}

