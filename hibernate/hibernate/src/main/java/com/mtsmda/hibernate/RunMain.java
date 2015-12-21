package com.mtsmda.hibernate;

import com.mtsmda.hibernate.model.Category;
import com.mtsmda.hibernate.model.Stock;
import com.mtsmda.hibernate.model.StockDailyRecord;
import com.mtsmda.hibernate.model.StockDetail;
import com.mtsmda.hibernate.model.manyToManyExtraColumns.Author;
import com.mtsmda.hibernate.model.manyToManyExtraColumns.Book;
import com.mtsmda.hibernate.model.manyToManyExtraColumns.BookAuthor;
import com.mtsmda.hibernate.model.manyToManyExtraColumns.solution2.Group;
import com.mtsmda.hibernate.model.manyToManyExtraColumns.solution2.User;
import com.mtsmda.hibernate.model.manyToManyExtraColumns.solution2.UserGroup;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;
import java.util.HashSet;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Stock stock = new Stock("stockCode1", "stockName1");

            StockDetail stockDetail = new StockDetail(stock, "compName1", "compDescription1", "remark1", new Date());
            stock.setStockDetail(stockDetail);

            Stock stock2 = new Stock("stockCode2", "stockName2");

            StockDailyRecord stockDailyRecord = new StockDailyRecord();
            stockDailyRecord.setDate(new Date());
            stockDailyRecord.setPriceChange(19.F);
            stockDailyRecord.setPriceClose(21.5F);
            stockDailyRecord.setPriceOpen(15.9F);
            stockDailyRecord.setStock(stock2);
            stockDailyRecord.setVolume(19056L);

            stock2.getStockDailyRecords().add(stockDailyRecord);

            Category category = new Category("Java", new HashSet<Stock>());
            category.getStocks().add(stock);
            category.getStocks().add(stock2);

            stock.getCategories().add(category);
            stock2.getCategories().add(category);


            Session session = sessionFactory.openSession();
            session.beginTransaction().begin();
            session.save(stock);
            session.save(stock2);

            manyToManyWithExtraColumns(session);
            solution2(session);


            session.getTransaction().commit();
            sessionFactory.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Here");
            System.exit(0);
        }

    }

    private static void manyToManyWithExtraColumns(Session session) {
        Book book = new Book();
        book.setBookName("Java 8");
        book.setBookDesc("Java 8 description");

        Author author = new Author();
        author.setFirstname("Vasilii");
        author.setLastname("Vasiliev");
        session.save(author);

        BookAuthor bookAuthor = new BookAuthor();
        bookAuthor.setAuthor(author);
        bookAuthor.setBook(book);
        bookAuthor.setCreatedBy("Ivanov");
        bookAuthor.setCreatedDate(new Date());

        book.getBookAuthors().add(bookAuthor);

        session.save(book);

    }

    private static void solution2(Session session) {
        User user = new User("username", "password", "vasya@mail.ru", new HashSet<UserGroup>());
        Group group = new Group("group1", new HashSet<UserGroup>());

        UserGroup userGroup = new UserGroup();
        userGroup.setActivated(false);
        userGroup.setGroup(group);
        userGroup.setUser(user);
        userGroup.setRegistredDate(new Date());

        session.save(userGroup);
    }

}