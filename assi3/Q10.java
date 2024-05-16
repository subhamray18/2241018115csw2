
import java.util.HashMap;
import java.util.Map;
 class MostOccurringWords {
public static void findMostOccurringWords(String str) {
HashMap<String, Integer> wordCount = new HashMap<>();
String[] words = str.split(" ");
for (String word : words) {
if (wordCount.containsKey(word)) {
wordCount.put(word, wordCount.get(word) + 1);
} else {
wordCount.put(word, 1);
}
}
String mostOccurringWord = "";
int maxCount = Integer.MIN_VALUE;
for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
if (entry.getValue() > maxCount) {
mostOccurringWord = entry.getKey();
maxCount = entry.getValue();
}
}
System.out.println("Mostoccurringword:"+mostOccurringWord+",frequency:"+maxCount);
}
public static void main (String[]args){
String str="Thisisasamplestring.Thisstringcontainssomewords.Thisisthemostoccurringwordinthisstring.";
findMostOccurringWords(str);
}
}