package com.mtsmda.hibernateM;

import com.mtsmda.hibernateM.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class RunMain {

    private static SessionFactory sessionFactory;

    static {
        getSessionFactory();
    }

    public static void main(String[] args) {
        Session session = sessionFactory.openSession();
        System.out.println(session.isConnected());

        Person person = new Person("Ivan","Ivanov");
        addPerson(person, session);

    }

    private static void addPerson(Person person, Session session) {
        try {
            Transaction transaction = session.beginTransaction();
            transaction.begin();
            session.save(person);
            transaction.commit();
        } catch (Exception e) {
            if (session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
            throw e;
        }
    }

    private static SessionFactory getSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sessionFactory;
    }

}
