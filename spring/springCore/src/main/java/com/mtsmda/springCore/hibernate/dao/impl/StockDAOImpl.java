package com.mtsmda.springCore.hibernate.dao.impl;

import com.mtsmda.springCore.hibernate.dao.StockDAO;
import com.mtsmda.springCore.hibernate.model.Stock;
import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by MTSMDA on 19.12.2015.
 */
@Repository(value = "stockDAO")
public class StockDAOImpl extends HibernateDaoSupport implements StockDAO {

    public StockDAOImpl() {

    }

    @Autowired
    public StockDAOImpl(SessionFactory sessionFactory) {
        this.setSessionFactory(sessionFactory);
    }

    @Transactional()
    public void insert(Stock stock) {
        HibernateTemplate hibernateTemplate = getHibernateTemplate();
        hibernateTemplate.save(stock);
    }

    public void update(Stock stock) {
        getHibernateTemplate().update(stock);
    }

    public void delete(Stock stock) {
        getHibernateTemplate().delete(stock);
    }

    public Stock getStock(Integer id) {
        return (Stock) getHibernateTemplate().find("from Stock where stockId=?", id).get(0);
    }

    public List<Stock> getStocks() {
        return null;
    }
}