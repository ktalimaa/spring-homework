package org.example.beans;

import org.example.interfaces.Book;
import org.springframework.stereotype.Component;

@Component(value = "bookName")
public class BookName implements Book {
    private String name;

    public BookName() {
        this.name = "The Silva Mind Control Method";
    }

    @Override
    public String getBook() {
        return this.name;
    }
}
