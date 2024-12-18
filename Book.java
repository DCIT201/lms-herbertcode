package org.example;

import java.util.Objects;

public final class Book {

    private final String title;
    private final String author;
    private final int yearPublished;

    public Book(String title, String author, int yearPublished) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        if (yearPublished <= 0) {
            throw new IllegalArgumentException("Year published must be positive");
        }

        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public int getYearPublished() {
        return yearPublished;
    }

    public String toString() {
        return String.format("Book [Title: %s, Author: %s, Year Published: %d]", title, author, yearPublished);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return yearPublished == book.yearPublished &&
               Objects.equals(title, book.title) &&
               Objects.equals(author, book.author);
    }
    public int hashCode() {
        return Objects.hash(title, author, yearPublished);
    }
}
