package com.mtsmda.hibernate;

import com.mtsmda.hibernate.model.manyToManyExtraColumns.Author;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by c-DMITMINZ on 30.12.2015.
 */
public class RunMainNamedQuery {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Query namedQuery = session.getNamedQuery("findAllCategories");
        for (Object o : namedQuery.list()) {
            System.out.println(o);
        }

        System.out.println("---------------------");
        List list = session.getNamedQuery("categories").setParameter("category_id", 5).list();
        for (Object o : list) {
            System.out.println(o);
        }


        session.close();
        System.exit(0);
    }

}