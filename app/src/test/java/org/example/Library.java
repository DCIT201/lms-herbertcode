import java.util.List;
public class Library {
    private String libraryName;
    private String location;
    private List<Book> books;
    private List<Patron> patrons;

    // Constructor
    public Library(String libraryName, String location){
        this.libraryName = libraryName;
        this.location = location;
    }

    // Getters and Setters for the fields
    public String getLibraryName(){
        return libraryName;
    }

    public void setLibraryName(String newLibraryName){
        this.libraryName = newLibraryName;
    }

    public String getlocation(){
        return this.address;
    }

    public void setlocation(String newlocation){
        this.address = newlocation;
    }
    public List<Book> getBooks() {
        return books;
    }

    public List<Patron> getPatrons() {
        return patrons;
    }

    // Methods to manage books
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getName() + " has been added to the library.");
    }

    public void removeBook(Book book){
        if(books.remove(book)){
            System.out.println(book.getName()+" has been removed from library.");
        }
        else{
            System.out.println(book.getName()+" is not found in the library");
        }
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println("- " + book.getName());
            }
        }
    }
    // Methods to manage patrons
    public void addPatron(Patron patron) {
        patrons.add(patron);
        System.out.println(patron.getName() + " has been registered as a patron.");
    }

    public void removePatron(Patron patron) {
        if (patrons.remove(patron)) {
            System.out.println(patron.getName() + " has been removed from the patron list.");
        } else {
            System.out.println(patron.getName() + " is not found in the patron list.");
        }
    }

    public void listPatrons() {
        if (patrons.isEmpty()) {
            System.out.println("No patrons registered in the library.");
        } else {
            System.out.println("Patrons registered in the library:");
            for (Patron patron : patrons) {
                System.out.println("- " + patron.getName());
            }
        }
    }

    // Display library details
    public void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("location: " + location);
        System.out.println("Number of Books: " + books);
        System.out.println("Number of Patrons: " + patrons);
    }
}
