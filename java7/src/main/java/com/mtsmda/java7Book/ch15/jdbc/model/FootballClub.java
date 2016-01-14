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

}