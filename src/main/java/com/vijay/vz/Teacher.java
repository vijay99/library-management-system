package com.vijay.vz;

public class Teacher extends User{
    public Teacher(String userName, String userId) {
        super(userName, userId);
    }

    @Override
    public void issueBook(Book book) {
        if (!book.isIssued()) {
            book.setIssued(true);
            System.out.println(getUserName() + " (Teacher) issued the book: " + book.getTitle());

        } else {
            System.out.println("Book: " + book.getTitle() + " is already issued.");
        }

    }
}
