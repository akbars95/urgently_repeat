package com.mtsmda.springCore.autowiring.repository;

import com.mtsmda.springCore.autowiring.model.FootballPlayer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Repository(value = "footballPlayerRepository")
public class FootballPlayerRepositoryImpl implements FootballPlayerRepository {

    private static List<FootballPlayer> footballPlayers = new ArrayList<>();

    @Override
    public boolean insert(FootballPlayer footballPlayer) {
        footballPlayers.add(footballPlayer);
        return true;
    }

    @Override
    public boolean update(FootballPlayer footballPlayer) {
        FootballPlayer footballPlayerById = getFootballPlayerById(footballPlayer.getId());
        delete(footballPlayerById);
        insert(footballPlayerById);
        return false;
    }

    @Override
    public boolean delete(FootballPlayer footballPlayer) {
        return footballPlayers.remove(footballPlayer);
    }

    @Override
    public FootballPlayer getFootballPlayerById(Integer id) {
        FootballPlayer footballPlayerResult = null;
        for (FootballPlayer footballPlayerCurrent : footballPlayers) {
            if (footballPlayerCurrent.getId().equals(id)) {
                footballPlayerResult = footballPlayerCurrent;
                break;
            }
        }
        return footballPlayerResult;
    }

    @Override
    public List<FootballPlayer> getFootballPlayers() {
        return footballPlayers;
    }
}