package com.dsa2024.opps.Relations;

import java.util.List;
import java.util.ArrayList;

// Book class
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

// Library class
class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}

public class Composition {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("1984");

        library.addBook(book1);
        library.addBook(book2);

        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
