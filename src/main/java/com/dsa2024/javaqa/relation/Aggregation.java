package com.dsa2024.javaqa.relation;

import java.util.ArrayList;
import java.util.List;

class Book {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public void showDetails() {
        System.out.println("Book Title: " + title);
    }
}

class Library {
    private final String name;
    private final List<Book> books;

    public Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public void showLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.showDetails();
        }
    }
}

public class Aggregation {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("1984");
        Book book3 = new Book("To Kill a Mockingbird");

        // Adding books to a list
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        // Creating Library object with the list of books
        Library library = new Library("City Library", books);

        // Showing library books
        library.showLibraryBooks();
    }
}

