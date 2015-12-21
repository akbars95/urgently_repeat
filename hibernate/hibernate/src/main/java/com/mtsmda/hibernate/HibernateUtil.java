package com.mtsmda.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
public class HibernateUtil {

    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        /*return new AnnotationConfiguration().buildSessionFactory();*/
        return new Configuration().configure(/*"hibernate.cfg.xml"*/).buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }

    public static void close() {
        getSessionFactory().close();
    }

}