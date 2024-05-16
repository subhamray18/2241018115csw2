
 class StringImmutability {
public static void main(String[] args) {
String s1 = "Hello";
String s2 = s1.toUpperCase();
System.out.println("s1: " + s1);
System.out.println("s2: " + s2);
s1 = s1 + " World!";
System.out.println("s1: " + s1);
System.out.println("s2: " + s2);
CharSequence cs = "Hello";
System.out.println("cs: " + cs);
System.out.println("cs.subSequence(0, 2): " + cs.subSequence(0, 2));
}
}