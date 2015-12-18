package com.mtsmda.springCore.autowiring;

import com.mtsmda.springCore.autowiring.model.FootballPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Component(value = "autowiredConstructor")
public class AutowiredConstructor {

    private FootballPlayer footballPlayer;

    public AutowiredConstructor() {

    }

    @Autowired(required = false)
    /*@Qualifier(value = "")*/
    public AutowiredConstructor(FootballPlayer footballPlayer) {
        this.footballPlayer = footballPlayer;
    }

    @Override
    public String toString() {
        return "AutowiredInstanceVariable{" +
                "footballPlayer=" + footballPlayer +
                '}';
    }

}