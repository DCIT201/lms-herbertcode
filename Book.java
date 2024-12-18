package org.example;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private int yearPublished;

    
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
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

    
    public int getYearPublished() {
        return yearPublished;
    }

    
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    
    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished + "]";
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return yearPublished == book.yearPublished &&
               Objects.equals(title, book.title) &&
               Objects.equals(author, book.author);
    }

   
    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublished);
    }
}
