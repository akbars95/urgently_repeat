package com.mtsmda.springCore.hibernate.withTransaction.controller;

import com.mtsmda.springCore.hibernate.withTransaction.model.Book;
import com.mtsmda.springCore.hibernate.withTransaction.service.BookServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by MTSMDA on 20.12.2015.
 */
@Controller(value = "bookController")
public class BookController {

    @Autowired
    @Qualifier(value = "bookService")
    private BookServiceI bookServiceI;

    public String index(Book book) {
        bookServiceI.insertBook(book);
        return "index";
    }

    public void get() {
        List<Book> books = bookServiceI.getBooks();
        System.out.println(books.size());
        for (Book bookCurrent : books) {
            System.out.println(bookCurrent);
            System.out.println(bookCurrent.getAuthors().toString());
        }
        System.out.println("DONE");
    }

}