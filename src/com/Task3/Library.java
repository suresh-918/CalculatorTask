package com.Task3;


import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && !b.isIssued()) {
                b.issue();
                System.out.println("Book issued: " + title);
                return;
            }
        }
        System.out.println("Book not available for issuing: " + title);
    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && b.isIssued()) {
                b.returnBook();
                System.out.println("Book returned: " + title);
                return;
            }
        }
        System.out.println("Book not found or not issued: " + title);
    }

    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

