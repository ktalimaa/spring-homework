package org.example.beans;

import lombok.Setter;
import org.example.interfaces.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Setter
@Component
public class MyBean {
    private Book name;

    public MyBean(@Qualifier("bookAuthor") Book name) {
        this.name = name;
    }

    public String bookInfo() {
        return "Book information: " + name.getBook();
    }
}
