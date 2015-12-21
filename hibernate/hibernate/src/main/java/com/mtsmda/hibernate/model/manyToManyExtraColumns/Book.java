package com.mtsmda.hibernate.model.manyToManyExtraColumns;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
@Entity()
@Table(name = "books")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "book_name", nullable = false, length = 50)
    private String bookName;

    @Column(name = "book_desc", nullable = false, length = 255)
    private String bookDesc;

    @OneToMany(/*fetch = FetchType.LAZY, */mappedBy = "bookAuthorId.book", cascade = CascadeType.ALL)
    private Set<BookAuthor> bookAuthors = new HashSet<BookAuthor>();

    public Book() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public Set<BookAuthor> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(Set<BookAuthor> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != null ? !id.equals(book.id) : book.id != null) return false;
        if (!bookName.equals(book.bookName)) return false;
        if (!bookDesc.equals(book.bookDesc)) return false;
        return bookAuthors.equals(book.bookAuthors);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + bookName.hashCode();
        result = 31 * result + bookDesc.hashCode();
        return result;
    }
}