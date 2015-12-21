package com.mtsmda.springCore.hibernate.withTransaction.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 20.12.2015.
 */
@Entity
@Table(name = "AUTHORS")
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id", nullable = false, unique = true)
    private Integer authorId;

    @Column(name = "author_firstname", nullable = false)
    private String authorFirstname;

    @Column(name = "author_lastname", nullable = false)
    private String authorLastname;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "authors")
    private List<Book> books = new ArrayList<>();


    public Author() {

    }

    public Author(String authorFirstname, String authorLastname, List<Book> books) {
        this.authorFirstname = authorFirstname;
        this.authorLastname = authorLastname;
        this.books = books;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorFirstname() {
        return authorFirstname;
    }

    public void setAuthorFirstname(String authorFirstname) {
        this.authorFirstname = authorFirstname;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (authorId != null ? !authorId.equals(author.authorId) : author.authorId != null) return false;
        if (!authorFirstname.equals(author.authorFirstname)) return false;
        if (!authorLastname.equals(author.authorLastname)) return false;
        return !(books != null ? !books.equals(author.books) : author.books != null);

    }

    @Override
    public int hashCode() {
        int result = authorId != null ? authorId.hashCode() : 0;
        result = 31 * result + authorFirstname.hashCode();
        result = 31 * result + authorLastname.hashCode();
        result = 31 * result + (books != null ? books.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorFirstname='" + authorFirstname + '\'' +
                ", authorLastname='" + authorLastname + '\'' +
                '}';
    }
}