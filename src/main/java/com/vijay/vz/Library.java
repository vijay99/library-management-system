package com.vijay.vz;

import java.util.ArrayList;
import java.util.List;

// 4.Implement the Library class (Polymorphism)
public class Library {
    private List<Book> bookList;

    public Library(){
        bookList= new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // List all books
    public void listBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    // Issue a book
    public void issueBook(User user, String title) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                user.issueBook(book);
                return;
            }
        }
        System.out.println("Book: " + title + " not found.");
    }
}
