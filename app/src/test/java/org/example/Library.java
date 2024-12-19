package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String address;
    private List<Book> books;

    // Constructor
    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " has been added to the library.");
    }

    // Remove a book from the library
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println(book.getTitle() + " has been removed from the library.");
        } else {
            System.out.println(book.getTitle() + " was not found in the library.");
        }
    }

    // Display details of all books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getYearPublished());
            }
        }
    }

    // Display library details
    public void displayLibraryDetails() {
        System.out.println("Library Name: " + name);
        System.out.println("Library Address: " + address);
        displayBooks();
    }
}

