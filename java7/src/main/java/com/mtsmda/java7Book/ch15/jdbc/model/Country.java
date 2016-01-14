package com.mtsmda.java7Book.ch15.jdbc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 13.01.2016.
 */
public class Country {

    private Integer id;
    private String name;
    private List<City> cities = new ArrayList<>();

    public Country() {

    }

    public Country(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}