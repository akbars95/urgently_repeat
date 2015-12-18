package com.mtsmda.springCore.autowiring;

import com.mtsmda.springCore.autowiring.model.FootballPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Component
public class AutowiredInstanceVariable {

    @Autowired
    @Qualifier(value = "Titov")
    private FootballPlayer footballPlayer;

    @Override
    public String toString() {
        return "AutowiredInstanceVariable{" +
                "footballPlayer=" + footballPlayer +
                '}';
    }
}