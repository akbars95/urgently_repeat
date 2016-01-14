package com.mtsmda.java7Book.ch15.jdbc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 13.01.2016.
 */
public class FootballClub {

    private Integer id;
    private String name;
    private City city;
    private List<Player> players = new ArrayList<>();

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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}