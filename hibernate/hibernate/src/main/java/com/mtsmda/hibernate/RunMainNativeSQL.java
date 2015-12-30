package com.mtsmda.hibernate;

import com.mtsmda.hibernate.model.manyToManyExtraColumns.Author;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by c-DMITMINZ on 30.12.2015.
 */
public class RunMainNativeSQL {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Query query = session.createSQLQuery("select * from authors a where a.author_id between :fromI and :beforeI").addEntity(Author.class).setParameter("fromI", 4).setParameter("beforeI", 6);
        for (Object o : query.list()) {
            System.out.println(o);
        }


        session.close();
        System.exit(0);
    }

}