package com.mtsmda.javaXML.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by c-DMITMINZ on 15.12.2015.
 */

@XmlRootElement(name = "footballClubs")
@XmlAccessorType(XmlAccessType.FIELD)
public class FootballClubs {

    @XmlElement(name = "footballClub")
    private List<FootballClub> footballClubs = null;

    public List<FootballClub> getFootballClubs() {
        return footballClubs;
    }

    public void setFootballClubs(List<FootballClub> footballClubs) {
        this.footballClubs = footballClubs;
    }
}