package com.mtsmda.springCore.hibernate.withTransaction.repository;

import com.mtsmda.springCore.hibernate.withTransaction.model.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by MTSMDA on 20.12.2015.
 */
@Repository(value = "bookRepository")
@Transactional(readOnly = true)
public class BookRepository extends HibernateDaoSupport implements BookRepositoryI {

    @Autowired
    public void setSF(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, readOnly = false)
    public void insertBook(Book book) {
        getHibernateTemplate().save(book);
    }

    @Override
    public void updateBook(Book book) {
        getHibernateTemplate().update(book);
    }

    @Override
    public void deleteBook(Book book) {
        getHibernateTemplate().delete(book);
    }

    @Override
    public Book getBookById(Integer bookId) {
        return (Book) getHibernateTemplate().find("from Book where bookId = ?;", bookId).get(0);
    }

    @Override
    public List<Book> getBooks() {
        return (List<Book>) getHibernateTemplate().find("from Book");
    }
}