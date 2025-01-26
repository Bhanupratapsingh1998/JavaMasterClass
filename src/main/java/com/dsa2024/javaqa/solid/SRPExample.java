package com.dsa2024.javaqa.solid;

// Class responsible for managing the content of the book
  class BookContent {
    private String content;

    public void addContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // Prints book content
    public void printContent() {
        System.out.println("Book Content: " + content);
    }
}

// Class responsible for saving the book content to the database
 class BookDatabase {
    public void saveToDatabase(BookContent bookContent) {
        // Logic to save book content to a database
        System.out.println("Saving book content to database...");
    }
}

// Main class to demonstrate SRP
public class SRPExample {
    public static void main(String[] args) {
        // Creating instances of BookContent and BookDatabase
        BookContent bookContent = new BookContent();
        bookContent.addContent("This is the content of the book.");

        BookDatabase bookDatabase = new BookDatabase();

        // Printing content and saving to database
        System.out.println("Book Title: SRP Compliant Book");
        bookContent.printContent(); // Prints book content
        bookDatabase.saveToDatabase(bookContent); // Saves the content to the database
    }
}

