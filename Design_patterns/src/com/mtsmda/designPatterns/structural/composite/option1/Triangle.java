package com.mtsmda.designPatterns.structural.composite.option1;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class Triangle implements Shape {

    @Override
    public void draw(String colorFill) {
        System.out.println("Drawing Triangle - " + colorFill);
    }

}