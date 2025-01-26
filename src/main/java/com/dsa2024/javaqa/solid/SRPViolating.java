package com.dsa2024.javaqa.solid;

// SRP Violating Code - Book class handles both content and saving to the database
 class Book {
    private final String title;
    private String content;

    public Book(String title) {
        this.title = title;
    }

    // Handles content management
    public void addContent(String content) {
        this.content = content;
    }

    // Handles database saving
    public void saveToDatabase() {
        System.out.println("Saving book to database...");
    }

    // Prints the book's content and database saving message
    public void printBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Content: " + content);
        saveToDatabase();
    }
}

public class SRPViolating {
    public static void main(String[] args) {
        // Creating Book instance
        Book book = new Book("SRP Violated Book");
        book.addContent("This is the content of the book.");
        book.printBookDetails(); // Prints book details and saves to database
    }
}
