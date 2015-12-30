package com.mtsmda.hibernate;

import com.mtsmda.hibernate.HibernateUtil;
import com.mtsmda.hibernate.model.manyToManyExtraColumns.Author;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by MTSMDA on 22.12.2015.
 */
public class RunMainHQL {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();


        String querySQL = "from Stock as s where s.stockCode = :stockCode";
        Query query = session.createQuery(querySQL);
        query.setParameter("stockCode", "stockCode1");
        List list = query.list();
        System.out.println("\n\n\n\n\n______________________________");
        for (Object o : list) {
            System.out.println(o.toString());
        }

//        updateHQL(session);
        insertHQL(session);
        getAllHQL(session);
        deleteHQL(session);
        System.out.println("after delete");
        getAllHQL(session);
        selectHQL(session);
        orderByHQL(session);
        groupByHQL(session);

        session.close();
        System.exit(0);

    }

    private static void groupByHQL(Session session) {
        System.out.println("______________groupByHQL________________");
        session.beginTransaction().begin();
        Query query = session.createQuery("select a.lastname, count(a.id) from Author a group by a.lastname");//, a.lastname
        List list = query.list();
        for (Object o : list) {
            if (o instanceof Object[]) {
                Object[] objects = (Object[]) o;
                for (Object o1 : objects) {
                    System.out.print(o1 + " - ");
                }
                System.out.println();
            }
        }
        session.beginTransaction().commit();
    }

    private static void orderByHQL(Session session) {
        System.out.println("______________orderByHQL________________");
        session.beginTransaction().begin();
        Query query = session.createQuery("select a from Author a order by a.firstname DESC");//, a.lastname
        List list = query.list();
        for (Object o : list) {
            if (o instanceof Author) {
                System.out.println(((Author) o));
            }
        }
        session.beginTransaction().commit();
    }

    private static void selectHQL(Session session) {
        System.out.println("______________selectHQL________________");
        session.beginTransaction().begin();
        Query query = session.createQuery("select a.firstname from Author a");//, a.lastname
        List list = query.list();
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("*********two");
        query = session.createQuery("select a.firstname, a.lastname from Author a");
        list = query.list();
        for (Object o : list) {
            if (o instanceof Object[]) {
                Object[] objects = (Object[]) o;
                for (Object o1 : objects) {
                    System.out.print(o1 + ", ");
                }
                System.out.println();
            }
        }
        session.beginTransaction().commit();
    }

    private static void updateHQL(Session session) {
        System.out.println("______________update________________");
        session.beginTransaction().begin();
        Query query = session.createQuery("update Stock set stockCode = :stockCode where stockId = :stockId");
        query.setParameter("stockId", 2);
        query.setParameter("stockCode", "19324530");
        System.out.println(query.executeUpdate());
        session.beginTransaction().commit();
    }

    private static void getAllHQL(Session session) {
        System.out.println("______________getAll________________");
        Query query = session.createQuery("from Stock");
        List list = query.list();
        for (Object o : list) {
            System.out.println(o);
        }
    }

    private static void insertHQL(Session session) {
        System.out.println("______________insertHQL________________");
        session.getTransaction().begin();

        Query query = session.createQuery("insert into Stock(stockCode, stockName) select bookName, bookDesc from Book where id = :bookId");
        query.setParameter("bookId", new Integer(1));
        System.out.println(query.executeUpdate());

        session.getTransaction().commit();
    }

    private static void deleteHQL(Session session) {
        System.out.println("______________deleteHQL________________");
        session.getTransaction().begin();

        Query query = session.createQuery("delete Stock where stockCode = :stockCode");
        query.setParameter("stockCode", new String("Java 8"));
        System.out.println(query.executeUpdate());

        session.getTransaction().commit();
    }

}