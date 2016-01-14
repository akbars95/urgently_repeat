package com.mtsmda.java7Book.ch15.jdbc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 13.01.2016.
 */
public class City {

    private Integer id;
    private String name;
    private Country country;
    private List<FootballClub> footballClubs = new ArrayList<>();

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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<FootballClub> getFootballClubs() {
        return footballClubs;
    }

    public void setFootballClubs(List<FootballClub> footballClubs) {
        this.footballClubs = footballClubs;
    }
}