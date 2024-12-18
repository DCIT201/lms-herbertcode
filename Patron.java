package org.example;

import java.util.ArrayList;
import java.util.List;
public class Patron {
    private String patronId;
    private String name;
    private int age;
    private String email;
    private List<Book> borrowedBooks;

    // Constructor
    public Patron(String patronId, String name, String email) {
        this.patronId = patronId;
        this.name = name;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and Setters
    public String getPatronId() {
        return patronId;
    }

    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    
    public int getAge(){
        return this.age;
    }


    public void borrowBoox(Book book){
        if(borrowedBooks.add(book)){
            System.out.println(book.getTitle() + " has been borrowed.");
        }
        else{
            System.out.println(book.getTitle()+" was not borrowed");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            System.out.println(name + " returned the book: " + book.getTitle());
        } else {
            System.out.println(name + " does not have the book: " + book.getTitle());
        }
    }

    public void listBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has not borrowed any books.");
        } else {
            System.out.println(name + " has borrowed the following books:");
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle());
            }
        }
    }

    // Display patron details
    public void displayPatronDetails() {
        System.out.println("Patron ID: " + patronId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Number of Borrowed Books: " + borrowedBooks.size());
    }
}
