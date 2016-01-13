package com.mtsmda.designPatterns.template;

/**
 * Created by c-DMITMINZ on 13.01.2016.
 */
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

}