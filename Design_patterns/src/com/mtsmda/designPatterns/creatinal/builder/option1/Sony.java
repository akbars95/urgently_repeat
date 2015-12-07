package com.mtsmda.designPatterns.creatinal.builder.option1;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class Sony extends Company {

    @Override
    public String pack() {
        return "Sony pack";
    }

    @Override
    public int price() {
        return 100;
    }
}