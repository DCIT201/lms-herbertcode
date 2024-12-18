package org.example;
import java.util.ArrayList;
import java.util.List;

public class Library{
    private String name;
    private String address;
    private List<Book> books;
    private List<Patron> patrons;

    Library(String name, String address){
        this.name = name;
        this. address = address;
        this.books = new ArrayList<Book>();
        this.patrons = new ArrayList<Patron>();
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }

    public void addBook(Book book){
        if(this.books.add(book)){
            System.out.println(book.getTitle()+" has been added to the library");
        }
        else{
            System.out.println(book.getTitle() +" was not added to the library");
        }
    }

    public void removeBook(Book book){
        if(this.books.contains(book)){
            this.books.remove(book);
            System.out.println(book.getTitle()+" has been removed from library");
        }
        else{
            System.out.println(book.getTitle()+" is not in the library");
        }
    }

    public void addPatron(Patron patron){
        if(this.patrons.add(patron)){
            System.out.println(patron.getName()+" has subscribed to the library");
        }
        else{
            System.out.println(patron.getName()+" could not be added to library subscription");
        }
    }

    public void displayBooks(){
        for(Book book:books){
            System.out.println("Title: "+book.getTitle()+ ", Author: "+book.getAuthor()+", Publication year: "+ book.getYearPublished());
        }
    }

    public void displayPatronDetails(){
        for(Patron patron:patrons){
            System.out.println("Name: "+patron.getName()+ ", Id: "+patron.getPatronId());
        }
    }

    public void displayLibraryDetails(){
        System.out.println("Name: "+ this.getName());
        System.out.println("Address: "+this.getAddress());
        this.displayBooks();
        this.displayPatronDetails();
    }


}
