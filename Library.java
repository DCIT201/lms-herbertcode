package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private String address;
    private List<Book> books;
    private List<Patron> patrons;

    
    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }


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

    
    public void addBook(Book book) {
        if (book == null) {
            System.out.println("Cannot add a null book.");
            return;
        }
        books.add(book);
        System.out.println(book.getTitle() + " has been added to the library.");
    }

   
    public void removeBook(Book book) {
        if (book == null) {
            System.out.println("Cannot remove a null book.");
            return;
        }
        if (books.remove(book)) {
            System.out.println(book.getTitle() + " has been removed from the library.");
        } else {
            System.out.println(book.getTitle() + " is not in the library.");
        }
    }

    public void addPatron(Patron patron) {
        if (patron == null) {
            System.out.println("Cannot add a null patron.");
            return;
        }
        patrons.add(patron);
        System.out.println(patron.getName() + " has subscribed to the library.");
    }

    
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Publication year: " + book.getYearPublished());
            }
        }
    }

    
    public void displayPatronDetails() {
        if (patrons.isEmpty()) {
            System.out.println("No patrons in the library.");
        } else {
            for (Patron patron : patrons) {
                System.out.println("Name: " + patron.getName() + ", ID: " + patron.getPatronId());
            }
        }
    }


    public void displayLibraryDetails() {
        System.out.println("Library Name: " + getName());
        System.out.println("Library Address: " + getAddress());
        displayBooks();
        displayPatronDetails();
    }
}
