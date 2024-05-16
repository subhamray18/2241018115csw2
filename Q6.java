
 abstract class LibraryResource {
    private String title;
    private String author;
    public LibraryResource(String title, String author) {
    this.title = title;
    this.author = author;
    }
    public String getTitle() {
    return title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
    public String getAuthor() {
    return author;
    }
    public void setAuthor(String author) {
    this.author = author;
    }
    public abstract void displayDetails();
    }
     class Book extends LibraryResource {
    private int pageCount;
    public Book(String title, String author, int pageCount) {
    super(title, author);
    this.pageCount = pageCount;
    }
    public int getPageCount() {
    return pageCount;
    }
    public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
    }
    public void displayDetails() {
    System.out.println("Title: " + getTitle());
    System.out.println("Author: " + getAuthor());
    System.out.println("Page Count: " + pageCount);
    }
    }
     class Magazine extends LibraryResource {
    private String issueDate;
    public Magazine(String title, String author, String issueDate) {
    super(title, author);
    this.issueDate = issueDate;
   }
    public String getIssueDate() {
    return issueDate;
    }
    public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
    }
    public void displayDetails() {
    System.out.println("Title: " + getTitle());
    System.out.println("Author: " + getAuthor());
    System.out.println("Issue Date: " + issueDate);
    }
    }
    class DVD extends LibraryResource {
    private String duration;
    public DVD(String title, String author, String duration) {
    super(title, author);
    this.duration = duration;
    }
    public String getDuration() {
    return duration;
    }
    public void setDuration(String duration) {
    this.duration = duration;
    }
    public void displayDetails() {
    System.out.println("Title: " + getTitle());
    System.out.println("Author: " + getAuthor());
    System.out.println("Duration: " + duration);
    }
    }
    class LibrarySystem {
    public static void main(String[] args) {
    LibraryResource book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
    LibraryResource magazine = new Magazine("National Geographic", "Editorial Staff", "March 2023");
    LibraryResource dvd = new DVD("The Matrix", "Lana Wachowski, Lilly Wachowski", "2 hours, 16 minutes");
    book.displayDetails();
    System.out.println();
    magazine.displayDetails();
    System.out.println();
    dvd.displayDetails();
    }
}