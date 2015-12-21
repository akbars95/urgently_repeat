package com.mtsmda.hibernate.model.manyToManyExtraColumns;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
@Entity
@Table(name = "book_author")
@AssociationOverrides({
        @AssociationOverride(name = "bookAuthorId.book", joinColumns = {
                @JoinColumn(name = "book_id")
        }),
        @AssociationOverride(name = "bookAuthorId.author", joinColumns = {
                @JoinColumn(name = "author_id")
        })
})
public class BookAuthor implements Serializable{

    @EmbeddedId
    private BookAuthorId bookAuthorId = new BookAuthorId();

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date", nullable = false, length = 10)
    private Date createdDate;

    @Column(name = "created_by", nullable = false, length = 10)
    private String createdBy;

    public BookAuthor() {

    }

    @Transient
    public Author getAuthor() {
        return getBookAuthorId().getAuthor();
    }

    public void setAuthor(Author author) {
        getBookAuthorId().setAuthor(author);
    }

    @Transient
    public Book getBook() {
        return getBookAuthorId().getBook();
    }

    public void setBook(Book book) {
        getBookAuthorId().setBook(book);
    }

    public BookAuthorId getBookAuthorId() {
        return bookAuthorId;
    }

    public void setBookAuthorId(BookAuthorId bookAuthorId) {
        this.bookAuthorId = bookAuthorId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookAuthor that = (BookAuthor) o;

        if (bookAuthorId != null ? !bookAuthorId.equals(that.bookAuthorId) : that.bookAuthorId != null) return false;
        if (!createdDate.equals(that.createdDate)) return false;
        return createdBy.equals(that.createdBy);

    }

    @Override
    public int hashCode() {
        int result = bookAuthorId != null ? bookAuthorId.hashCode() : 0;
        result = 31 * result + createdDate.hashCode();
        result = 31 * result + createdBy.hashCode();
        return result;
    }
}