package com.Task3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User user = new User(1, "Suresh");

        // Add books
        library.addBook(new Book("Java Programming", "James Gosling"));
        library.addBook(new Book("Python Basics", "Guido van Rossum"));
        library.addBook(new Book("C++ Primer", "Stanley Lippman"));

        // Display books
        System.out.println("📚 Available Books:");
        library.displayBooks();

        // Issue a book
        System.out.println("\n" + user.getName() + " is issuing a book...");
        library.issueBook("Java Programming");

        // Display after issuing
        System.out.println("\n📚 Books after issuing:");
        library.displayBooks();

        // Return a book
        System.out.println("\n" + user.getName() + " is returning a book...");
        library.returnBook("Java Programming");

        // Display after returning
        System.out.println("\n📚 Books after returning:");
        library.displayBooks();
    }
}
