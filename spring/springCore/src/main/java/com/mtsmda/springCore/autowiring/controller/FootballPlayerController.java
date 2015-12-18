package com.mtsmda.springCore.autowiring.controller;

import com.mtsmda.springCore.autowiring.model.FootballPlayer;
import com.mtsmda.springCore.autowiring.service.FootballPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Controller(value = "footballPlayerController")
public class FootballPlayerController {

    @Autowired
    @Qualifier(value = "footballPlayerService")
    private FootballPlayerService footballPlayerService;

    public FootballPlayerService getFootballPlayerService() {
        return footballPlayerService;
    }

    public void setFootballPlayerService(FootballPlayerService footballPlayerService) {
        this.footballPlayerService = footballPlayerService;
    }

    public void index(){
        FootballPlayer footballPlayer = new FootballPlayer("Leo", "Messi", 28, 10);
        footballPlayer.setId(1);
        footballPlayerService.insert(footballPlayer);
        for(FootballPlayer footballPlayerCurrent : footballPlayerService.getFootballPlayers()){
            System.out.println(footballPlayerCurrent.toString());
        }
    }

}