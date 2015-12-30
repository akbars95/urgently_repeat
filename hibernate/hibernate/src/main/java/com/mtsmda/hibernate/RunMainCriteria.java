package com.mtsmda.hibernate;

import com.mtsmda.hibernate.model.StockDailyRecord;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by c-DMITMINZ on 30.12.2015.
 */
public class RunMainCriteria {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Criteria criteria = session.createCriteria(StockDailyRecord.class);
        criteria.add(Restrictions.ge("volume", new Long(19)));
        System.out.println("-------------------------------------------------");
        List list = criteria.list();
        for(Object o : list){
            StockDailyRecord stockDailyRecord = (StockDailyRecord) o;
            System.out.println(stockDailyRecord.toString());
        }

        session.close();
        System.exit(0);
    }

}