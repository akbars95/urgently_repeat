package com.mtsmda.hibernate.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
@Entity
@Table(name = "stockDailyRecords")
public class StockDailyRecord {

    private Integer recordId;
    private Stock stock;
    private Float priceOpen;
    private Float priceClose;
    private Float priceChange;
    private Long volume;
    private Date date;

    public StockDailyRecord() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id", nullable = false, unique = true)
    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stock_id", nullable = false)
    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Column(name = "price_open", precision = 6)
    public Float getPriceOpen() {
        return priceOpen;
    }

    public void setPriceOpen(Float priceOpen) {
        this.priceOpen = priceOpen;
    }

    @Column(name = "price_close", precision = 6)
    public Float getPriceClose() {
        return priceClose;
    }

    public void setPriceClose(Float priceClose) {
        this.priceClose = priceClose;
    }

    @Column(name = "price_change", precision = 6)
    public Float getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(Float priceChange) {
        this.priceChange = priceChange;
    }

    @Column(name = "volume")
    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "record_date", unique = true, nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockDailyRecord that = (StockDailyRecord) o;

        if (!recordId.equals(that.recordId)) return false;
        if (!stock.equals(that.stock)) return false;
        if (!priceOpen.equals(that.priceOpen)) return false;
        if (!priceClose.equals(that.priceClose)) return false;
        if (!priceChange.equals(that.priceChange)) return false;
        if (!volume.equals(that.volume)) return false;
        return date.equals(that.date);

    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + stock.hashCode();
        result = 31 * result + priceOpen.hashCode();
        result = 31 * result + priceClose.hashCode();
        result = 31 * result + priceChange.hashCode();
        result = 31 * result + volume.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "StockDailyRecord{" +
                "recordId=" + recordId +
                ", stock=" + stock +
                ", priceOpen=" + priceOpen +
                ", priceClose=" + priceClose +
                ", priceChange=" + priceChange +
                ", volume=" + volume +
                ", date=" + date +
                '}';
    }
}