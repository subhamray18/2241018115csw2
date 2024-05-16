

    import java.util.HashMap;
    import java.util.Map;
     class Library {
    private Map<Integer, Book> books;
    public Library() {
    books = new HashMap<>();
    }
    public void addBook(Book book) {
    books.put(book.getId(), book);
    }
    public boolean containsBook(String name) {
    for (Book book : books.values()) {
    if (book.getName().equals(name)) {
    return true;
    }
    }
    return false;
    }
    public void removeBook(int id) {
    books.remove(id);
    }
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Library [books=");
    sb.append(books);
    sb.append("]");
    return sb.toString();
    }
    }
    
     class LibraryApp {
    public static void main(String[] args) {
    Library library = new Library();
    library.addBook(new Book(1, "The Catcher in the Rye", "J.D. Salinger", 10));
    library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee", 15));
    System.out.println("Library: " + library);
    System.out.println("\nContains book: The Catcher in the Rye? " + library.containsBook("The Catcher in the Rye"));
    library.removeBook(1);
   }
}
    System.out.println("\nUpdated Library: " + library);
        private int id;
        private String name;
        private String author;
        private int quantity;
        public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
       }
        public int getId() {
        return id;
        }
        public void setId(int id) {
        this.id = id;
        }
        public String getName() {
        return name;
        }
        public void setName(String name) {
        this.name = name;
        }
        public String getAuthor() {
        return author;
        }
        
        public void setAuthor(String author) {
        this.author = author;
        }
        public int getQuantity() {
        return quantity;
        }
        public void setQuantity(int quantity) {
        this.quantity = quantity;
        }
        public String toString() {
        return String.format("Book [id=%d, name=%s, author=%s, quantity=%d]", id, name, author, quantity);
        }
    }
