package com.mtsmda.springCore.hibernate.withTransaction.repository;

import com.mtsmda.springCore.hibernate.withTransaction.model.Book;

import java.util.List;

/**
 * Created by MTSMDA on 20.12.2015.
 */
public interface BookRepositoryI {

    void insertBook(Book book);

    void updateBook(Book book);

    void deleteBook(Book book);

    Book getBookById(Integer bookId);

    List<Book> getBooks();
}