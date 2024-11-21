package com.vijay.vz;

public class Student extends User{

    public Student(String userName, String userId) {
        super(userName, userId);
    }

    @Override
    public void issueBook(Book book) {
        if (!book.isIssued()) {
            book.setIssued(true);
            System.out.println(getUserName() + " (Student) issued the book: " + book.getTitle());

        } else {
            System.out.println("Book: " + book.getTitle() + " is already issued.");
        }

    }
}
