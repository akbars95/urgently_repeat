package com.mtsmda.springCore.inheritance;

/**
 * Created by c-DMITMINZ on 17.12.2015.
 */
public class Player {

    private Integer id;
    private String name;
    private Integer number;
    private String footballClub;

    public Player() {

    }

    public Player(Integer id, String name, Integer number) {
        this.id = id;
        this.name = name;
        this.number = number;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFootballClub() {
        return footballClub;
    }

    public void setFootballClub(String footballClub) {
        this.footballClub = footballClub;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", footballClub='" + footballClub + '\'' +
                '}';
    }
}