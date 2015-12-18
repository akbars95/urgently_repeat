package com.mtsmda.springCore.autowiring.repository;

import com.mtsmda.springCore.autowiring.model.FootballPlayer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
public interface FootballPlayerRepository {

    public boolean insert(FootballPlayer footballPlayer);

    public boolean update(FootballPlayer footballPlayer);

    public boolean delete(FootballPlayer footballPlayer);

    public FootballPlayer getFootballPlayerById(Integer id);

    public List<FootballPlayer> getFootballPlayers();

}