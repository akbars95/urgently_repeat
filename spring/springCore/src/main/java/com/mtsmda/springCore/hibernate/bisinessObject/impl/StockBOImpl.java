package com.mtsmda.springCore.hibernate.bisinessObject.impl;

import com.mtsmda.springCore.hibernate.bisinessObject.StockBO;
import com.mtsmda.springCore.hibernate.dao.StockDAO;
import com.mtsmda.springCore.hibernate.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MTSMDA on 19.12.2015.
 */
@Service(value = "stockBO")
public class StockBOImpl implements StockBO {

    @Autowired
    @Qualifier(value = "stockDAO")
    private StockDAO stockDAO;

    public void insert(Stock stock) {
        stockDAO.insert(stock);
    }

    public void update(Stock stock) {
        stockDAO.update(stock);
    }

    public void delete(Stock stock) {
        stockDAO.delete(stock);
    }

    public Stock getStock(Integer id) {
        return stockDAO.getStock(id);
    }

    public List<Stock> getStocks() {
        return stockDAO.getStocks();
    }
}