package org.example;

import org.example.beans.BookName;
import org.example.beans.MyBean;
import org.example.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();

        MyBean myBean = applicationContext.getBean(MyBean.class);
        System.out.println(myBean.bookInfo());

        myBean.setName(new BookName());
        System.out.println(myBean.bookInfo());

    }
}