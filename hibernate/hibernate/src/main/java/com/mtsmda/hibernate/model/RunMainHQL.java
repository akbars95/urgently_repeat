package com.mtsmda.hibernate.model;

import com.mtsmda.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by MTSMDA on 22.12.2015.
 */
public class RunMainHQL {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();


        String querySQL = "from Stock where stockCode = :stockCode";
        Query query = session.createQuery(querySQL);
        query.set

    }

}