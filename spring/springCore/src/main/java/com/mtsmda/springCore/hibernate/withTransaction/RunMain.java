package com.mtsmda.springCore.hibernate.withTransaction;

import com.mtsmda.springCore.hibernate.withTransaction.controller.BookController;
import com.mtsmda.springCore.hibernate.withTransaction.model.Author;
import com.mtsmda.springCore.hibernate.withTransaction.model.Book;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MTSMDA on 20.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("hibernate/springBeansHibernate.xml");
        BookController bookController = configurableApplicationContext.getBean("bookController", BookController.class);

        Author author = new Author();
        author.setAuthorFirstname("Gerbrd");
        author.setAuthorLastname("Shildt");

        Book book = new Book();
        book.setBookName("Java 8");
        book.setBookYear(2015);
        book.getAuthors().add(author);


        bookController.index(book);
        bookController.get();
    }

}