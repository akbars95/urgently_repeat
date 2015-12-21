package com.mtsmda.springCore.hibernate.withTransaction.service;

import com.mtsmda.springCore.hibernate.withTransaction.model.Book;
import com.mtsmda.springCore.hibernate.withTransaction.repository.BookRepository;
import com.mtsmda.springCore.hibernate.withTransaction.repository.BookRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MTSMDA on 20.12.2015.
 */
@Service(value = "bookService")
public class BookService implements BookServiceI {

    @Autowired
    @Qualifier(value = "bookRepository")
    private BookRepositoryI bookRepositoryI;

    @Override
    public void insertBook(Book book) {
        bookRepositoryI.insertBook(book);
    }

    @Override
    public void updateBook(Book book) {
        bookRepositoryI.updateBook(book);
    }

    @Override
    public void deleteBook(Book book) {
        bookRepositoryI.deleteBook(book);
    }

    @Override
    public Book getBookById(Integer bookId) {
        return bookRepositoryI.getBookById(bookId);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepositoryI.getBooks();
    }
}