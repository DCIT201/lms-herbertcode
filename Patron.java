package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Patron {
    
    private String patronId;
    private String name;
    private int age;
    private String email;
    private List<Book> borrowedBooks;

    public Patron(String patronId, String name, String email, int age) {
        this.patronId = patronId;
        this.name = name;
        this.email = email;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

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
        return Collections.unmodifiableList(borrowedBooks); // Prevent external modification
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    
    public void borrowBook(Book book) {
        if (book == null) {
            System.out.println("Cannot borrow a null book.");
            return;
        }
        if (borrowedBooks.contains(book)) {
            System.out.println("You have already borrowed the book: " + book.getTitle());
        } else {
            borrowedBooks.add(book);
            System.out.println(book.getTitle() + " has been borrowed.");
        }
    }

    
    public void returnBook(Book book) {
        if (book == null) {
            System.out.println("Cannot return a null book.");
            return;
        }
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

    
    public void displayPatronDetails() {
        System.out.println("Patron ID: " + patronId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Number of Borrowed Books: " + borrowedBooks.size());
    }
}
