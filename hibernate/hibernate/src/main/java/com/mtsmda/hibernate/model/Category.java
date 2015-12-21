package com.mtsmda.hibernate.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", unique = true, nullable = false)
    private Integer categoryId;

    @Column(name = "category_name", nullable = false, length = 10)
    private String categoryName;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
    private Set<Stock> stocks = new HashSet<Stock>();

    public Category() {

    }

    public Category(String categoryName, Set<Stock> stocks) {
        this.categoryName = categoryName;
        this.stocks = stocks;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(Set<Stock> stocks) {
        this.stocks = stocks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (!categoryId.equals(category.categoryId)) return false;
        if (!categoryName.equals(category.categoryName)) return false;
        return stocks.equals(category.stocks);

    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + categoryName.hashCode();
        result = 31 * result + stocks.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", stocks=" + stocks +
                '}';
    }
}