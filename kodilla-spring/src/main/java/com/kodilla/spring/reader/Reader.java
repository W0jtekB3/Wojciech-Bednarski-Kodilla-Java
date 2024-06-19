package com.kodilla.spring.reader;

public class Reader {

    private Book book;

    public Reader(Book book) {
        this.book = book;
    }

    public void read() {
        System.out.println("Reading: " + book.getTitle());
    }
}
