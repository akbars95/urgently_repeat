package com.mtsmda.hibernate.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
@Entity
@Table(name = "stockDetails")
public class StockDetail {

    private Integer stockId;
    private Stock stock;
    private String compName;
    private String compDescription;
    private String remark;
    private Date listedDate;

    public StockDetail() {

    }

    public StockDetail(Stock stock, String compName, String compDescription, String remark, Date listedDate) {
        this.stock = stock;
        this.compName = compName;
        this.compDescription = compDescription;
        this.remark = remark;
        this.listedDate = listedDate;
    }

    @GenericGenerator(name = "generator", strategy = "foreign", parameters = {
            @Parameter(name = "property", value = "stock")
    })
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "stock_id", nullable = false, unique = true)
    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Column(name = "comp_name", nullable = false)
    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    @Column(name = "comp_description", nullable = true)
    public String getCompDescription() {
        return compDescription;
    }

    public void setCompDescription(String compDescription) {
        this.compDescription = compDescription;
    }

    @Column(name = "remark", nullable = true)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Temporal(value = TemporalType.DATE)
    @Column(name = "listed_date", nullable = true, length = 10)
    public Date getListedDate() {
        return listedDate;
    }

    public void setListedDate(Date listedDate) {
        this.listedDate = listedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockDetail that = (StockDetail) o;

        if (!stockId.equals(that.stockId)) return false;
        if (!stock.equals(that.stock)) return false;
        if (!compName.equals(that.compName)) return false;
        if (!compDescription.equals(that.compDescription)) return false;
        if (!remark.equals(that.remark)) return false;
        return listedDate.equals(that.listedDate);

    }

    @Override
    public int hashCode() {
        int result = stockId.hashCode();
        result = 31 * result + stock.hashCode();
        result = 31 * result + compName.hashCode();
        result = 31 * result + compDescription.hashCode();
        result = 31 * result + remark.hashCode();
        result = 31 * result + listedDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "StockDetail{" +
                "stockId=" + stockId +
                ", stock=" + stock +
                ", compName='" + compName + '\'' +
                ", compDescription='" + compDescription + '\'' +
                ", remark='" + remark + '\'' +
                ", listedDate=" + listedDate +
                '}';
    }
}