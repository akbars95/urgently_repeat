package com.mtsmda.springCore.autowiring;

import com.mtsmda.springCore.autowiring.model.FootballPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Component
public class AutowiredSetter {

    private FootballPlayer footballPlayer;

    public FootballPlayer getFootballPlayer() {
        return footballPlayer;
    }

    @Autowired
    @Qualifier(value = "Titov")
    public void setFootballPlayer(FootballPlayer footballPlayer) {
        this.footballPlayer = footballPlayer;
    }
}
