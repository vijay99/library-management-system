# Library Management System

## Project Description
The Library Management System is a simple Java-based application designed to demonstrate Object-Oriented Programming (OOP) principles: **Encapsulation**, **Inheritance**, **Polymorphism**, and **Abstraction**. It simulates basic library functionalities, including adding books, issuing books, and maintaining book statuses.

---

## Features
- Add books to the library.
- View a list of all available and issued books.
- Issue books to different types of users (`Student` or `Teacher`).
- Showcases:
    - **Encapsulation**: Protects book details using private fields and public getters/setters.
    - **Inheritance**: Allows `Student` and `Teacher` to inherit common properties and behaviors from the `User` class.
    - **Polymorphism**: Enables runtime behavior via overridden methods.
    - **Abstraction**: Defines common functionality for users in an abstract `User` class.

---

## Technologies Used
- Java
- Object-Oriented Programming (OOP) concepts

---

## How to Run
1. Clone the repository to your local machine.
2. Open the project in any Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Compile and run the `LibraryManagementSystem.java` file.
4. Follow the example flow to interact with the library.

---

## Example Output
Book added: Java Programming Alice (Student) issued the book: Java Programming Bob (Teacher) issued the book: Clean Code

## Future Enhancements
- Implement book return functionality.
- Add a database to persist library data.
- Extend user roles with additional permissions.
