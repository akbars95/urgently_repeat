package com.mtsmda.springCore.hibernate.withTransaction.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 20.12.2015.
 */
@Entity
@Table(name = "BOOKS")
public class Book implements Serializable {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "book_id", unique = true, nullable = false)
    private String bookId;

    @Column(name = "book_name", nullable = false, length = 100)
    private String bookName;

    @Column(name = "book_year", nullable = false)
    private Integer bookYear;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "books_authors", joinColumns = {
            @JoinColumn(name = "book_id", nullable = false, updatable = false)
    }, inverseJoinColumns = {
            @JoinColumn(name = "author_id", nullable = false, updatable = false)
    })
    private List<Author> authors = new ArrayList<>();


    public Book() {

    }

    public Book(String bookName, Integer bookYear, List<Author> authors) {
        this.bookName = bookName;
        this.bookYear = bookYear;
        this.authors = authors;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookYear() {
        return bookYear;
    }

    public void setBookYear(Integer bookYear) {
        this.bookYear = bookYear;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (bookId != null ? !bookId.equals(book.bookId) : book.bookId != null) return false;
        if (!bookName.equals(book.bookName)) return false;
        if (!bookYear.equals(book.bookYear)) return false;
        return !(authors != null ? !authors.equals(book.authors) : book.authors != null);

    }

    @Override
    public int hashCode() {
        int result = bookId != null ? bookId.hashCode() : 0;
        result = 31 * result + bookName.hashCode();
        result = 31 * result + bookYear.hashCode();
        result = 31 * result + (authors != null ? authors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookYear=" + bookYear +
                '}';
    }
}