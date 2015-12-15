package com.mtsmda.javaXML.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by c-DMITMINZ on 15.12.2015.
 */
@XmlRootElement
public class FootballClub {

    private String clubName;
    private String coutry;
    private String city;
    private String leaderName;
    private int countChampionWon;

    public FootballClub() {

    }

    public FootballClub(String clubName, String coutry, String city, String leaderName, int countChampionWon) {
        this.clubName = clubName;
        this.coutry = coutry;
        this.city = city;
        this.leaderName = leaderName;
        this.countChampionWon = countChampionWon;
    }

    public String getClubName() {
        return clubName;
    }

    /*@XmlElement*/
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getCoutry() {
        return coutry;
    }

    /*@XmlElement*/
    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

    public String getCity() {
        return city;
    }

    /*@XmlElement*/
    public void setCity(String city) {
        this.city = city;
    }

    public String getLeaderName() {
        return leaderName;
    }

    /*@XmlElement*/
    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public int getCountChampionWon() {
        return countChampionWon;
    }

    /*@XmlElement*/
    public void setCountChampionWon(int countChampionWon) {
        this.countChampionWon = countChampionWon;
    }
}