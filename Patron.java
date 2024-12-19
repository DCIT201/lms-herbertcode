package org.example;
public class Patron {
    private String name;
    private String patronId;

    // Constructor
    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPatronId() {
        return patronId;
    }
}

