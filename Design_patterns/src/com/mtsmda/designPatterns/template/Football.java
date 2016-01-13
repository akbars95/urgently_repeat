package com.mtsmda.designPatterns.template;

/**
 * Created by c-DMITMINZ on 13.01.2016.
 */
public class Football extends Game{


    @Override
    void initialize() {
        System.out.println(this.getClass().getName() + " initialize");
    }

    @Override
    void startPlay() {
        System.out.println(this.getClass().getName() + " startPlay");
    }

    @Override
    void endPlay() {
        System.out.println(this.getClass().getName() + " endPlay");
    }
}