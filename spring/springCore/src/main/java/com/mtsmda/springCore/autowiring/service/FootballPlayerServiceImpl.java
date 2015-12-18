package com.mtsmda.springCore.autowiring.service;

import com.mtsmda.springCore.autowiring.model.FootballPlayer;
import com.mtsmda.springCore.autowiring.repository.FootballPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Service(value = "footballPlayerService")
public class FootballPlayerServiceImpl implements FootballPlayerService {

    @Autowired
    @Qualifier(value = "footballPlayerRepository")
    private FootballPlayerRepository footballPlayerRepository;


    @Override
    public boolean insert(FootballPlayer footballPlayer) {
        return footballPlayerRepository.insert(footballPlayer);
    }

    @Override
    public boolean update(FootballPlayer footballPlayer) {
        return footballPlayerRepository.update(footballPlayer);
    }

    @Override
    public boolean delete(FootballPlayer footballPlayer) {
        return footballPlayerRepository.delete(footballPlayer);
    }

    @Override
    public FootballPlayer getFootballPlayerById(Integer id) {
        return footballPlayerRepository.getFootballPlayerById(id);
    }

    @Override
    public List<FootballPlayer> getFootballPlayers() {
        return footballPlayerRepository.getFootballPlayers();
    }
}
