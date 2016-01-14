package com.mtsmda.java7Book.ch15.jdbc.model;

/**
 * Created by MTSMDA on 13.01.2016.
 */
public class Player {

    private Integer id;
    private String lastName;
    private String firstName;
    private FootballClub footballClub;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public FootballClub getFootballClub() {
        return footballClub;
    }

    public void setFootballClub(FootballClub footballClub) {
        this.footballClub = footballClub;
    }
}