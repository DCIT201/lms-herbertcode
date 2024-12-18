package org.example;

public class Book {
    //Initializing Variables
    private String title;
    private String author;
    private int yearPublished;
    private boolean isBorrowed = false;

    //Constructor Function
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    //Title Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Author Getter and Setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //YearPublished Getter and Setter
    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    //isBorrowed getter and setter
    public boolean getIsBorrowed() {
    return isBorrowed;
}

    public void setIsBorrowed() {
    isBorrowed = !isBorrowed;
}


    //Method to return a book
    public boolean returnBook() {
        if (!isBorrowed) {
            System.out.println("This book is not borrowed");
            return false;
        } else {
            System.out.println("This book has been returned");
            isBorrowed = false;
            return true;
        }
    }
}
