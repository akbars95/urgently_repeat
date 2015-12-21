package com.mtsmda.hibernate.model.manyToManyExtraColumns;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
@Embeddable
public class BookAuthorId implements Serializable {

    @ManyToOne(cascade = CascadeType.ALL)
    private Book book;

    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;

    public BookAuthorId() {

    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookAuthorId that = (BookAuthorId) o;

        if (!book.equals(that.book)) return false;
        return author.equals(that.author);

    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + author.hashCode();
        return result;
    }
}