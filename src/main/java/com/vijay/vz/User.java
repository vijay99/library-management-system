package com.vijay.vz;

//2.Abstraction
//3.Extend User into Student and Teacher (Inheritance)
public abstract class User {
    String userId;
    String userName;

    public User(String userName, String userId) {
        this.userName=userName;
        this.userId=userId;
    }

    //abstract method
    public abstract void issueBook(Book book);

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
