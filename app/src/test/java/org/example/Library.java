import java.util.ArrayList;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library("Balme Library");
        library.addBook(new Book("1984", "George Orwell", "1234567890"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "1234567891"));
        library.displayBooks();
    }
}

class Book {
    private final String title, author, isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println(title + " by " + author + " (ISBN: " + isbn + ")");
    }
}

class Library {
    private final String name;
    private final ArrayList<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in " + name);
        } else {
            books.forEach(Book::displayDetails);
        }
    }
}
