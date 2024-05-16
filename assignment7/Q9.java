 class WordReplacement {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String sentence = scanner.nextLine();
    System.out.print("Enter the word to search for: ");
    String searchWord = scanner.next();
    System.out.print("Enter the word to replace it with: ");
    String replaceWord = scanner.next();
    int index = sentence.indexOf(searchWord);
    if (index !=-1) {
    String newSentence = sentence.substring(0, index) + replaceWord + sentence.substring(index +
    searchWord.length());
    System.out.println("Original sentence: " + sentence);
    System.out.println("Modified sentence: " + newSentence);
    } else {
    System.out.println("The word '" + searchWord + "' was not found in the sentence.");
    }
    }
}