public class Q28 {
    public static void main(String[] args) {
    try {
    recursiveMethod(0);
    } catch (StackOverflowError e) {
    System.err.println("StackOverflowError caught: " + e.getMessage());
    }
    }
    public static void recursiveMethod(int num) {
    if (num == 10) {
    return;
    }
    
    recursiveMethod(num + 1);}
    }
    