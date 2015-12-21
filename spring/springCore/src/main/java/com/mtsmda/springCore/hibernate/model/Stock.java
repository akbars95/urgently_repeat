package com.mtsmda.springCore.hibernate.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by MTSMDA on 19.12.2015.
 */
@Entity
@Table(name = "STOCK")
public class Stock implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idStock", unique = true, nullable = false)
    private Integer stockId;

    @Column(name = "codeStock", nullable = false, unique = true)
    private String stockCode;

    @Column(name = "nameStock", nullable = false, unique = true)
    private String stockName;

    public Stock() {

    }

    public Stock(String stockCode, String stockName) {
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", stockCode='" + stockCode + '\'' +
                ", stockName='" + stockName + '\'' +
                '}';
    }
}