package com.mtsmda.hibernate.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
@Entity
@Table(name = "stocks")
public class Stock {

    private Integer stockId;
    private String stockCode;
    private String stockName;
    private StockDetail stockDetail;
    private Set<StockDailyRecord> stockDailyRecords = new HashSet<StockDailyRecord>();
    private Set<Category> categories = new HashSet<Category>();

    public Stock() {

    }

    public Stock(String stockCode, String stockName) {
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_id", nullable = false, unique = true)
    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    @Column(name = "stock_code", nullable = false, length = 255)
    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    @Column(name = "stock_name", nullable = false, length = 255)
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "stock", cascade = CascadeType.ALL)
    public StockDetail getStockDetail() {
        return stockDetail;
    }

    public void setStockDetail(StockDetail stockDetail) {
        this.stockDetail = stockDetail;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "stock", cascade = CascadeType.ALL)
    public Set<StockDailyRecord> getStockDailyRecords() {
        return stockDailyRecords;
    }

    public void setStockDailyRecords(Set<StockDailyRecord> stockDailyRecords) {
        this.stockDailyRecords = stockDailyRecords;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "stock_category", joinColumns = {
            @JoinColumn(name = "stock_id", nullable = false)
    }, inverseJoinColumns = {
            @JoinColumn(name = "category_id", nullable = false)
    })
    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stock stock = (Stock) o;

        if (!stockId.equals(stock.stockId)) return false;
        if (!stockCode.equals(stock.stockCode)) return false;
        return stockName.equals(stock.stockName);

    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + stockCode.hashCode();
        result = 31 * result + stockName.hashCode();
        return result;
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