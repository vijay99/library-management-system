package com.vijay.vz;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("Java Programming", "James Gosling"));
        library.addBook(new Book("Effective Java", "Joshua Bloch"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        // List available books
        library.listBooks();

        // Create users
        User student = new Student("Alice", "S001");
        User teacher = new Teacher("Bob", "T001");

        // Issue books
        library.issueBook(student, "Java Programming");
        library.issueBook(teacher, "Java Programming"); // Already issued
        library.issueBook(teacher, "Clean Code");

        // List books again to show updated status
        library.listBooks();
    }
}

