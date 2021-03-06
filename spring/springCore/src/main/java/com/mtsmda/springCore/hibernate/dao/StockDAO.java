package com.mtsmda.springCore.hibernate.dao;

import com.mtsmda.springCore.hibernate.model.Stock;

import java.util.List;

/**
 * Created by MTSMDA on 19.12.2015.
 */
public interface StockDAO {

    void insert(Stock stock);

    void update(Stock stock);

    void delete(Stock stock);

    Stock getStock(Integer id);

    List<Stock> getStocks();

}