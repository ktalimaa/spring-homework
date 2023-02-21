package org.example.beans;

import org.example.interfaces.Book;
import org.springframework.stereotype.Component;

@Component(value = "bookAuthor")
public class BookAuthor implements Book {
    private String name;

    public BookAuthor() {
        this.name = "Jose Silva";
    }

    @Override
    public String getBook() {
        return this.name;
    }
}
