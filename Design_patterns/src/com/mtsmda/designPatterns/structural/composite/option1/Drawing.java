package com.mtsmda.designPatterns.structural.composite.option1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String colorFill) {
        for (Shape shape : shapes) {
            shape.draw(colorFill);
        }
    }

    public void add(Shape shape){
        shapes.add(shape);
    }

    public void delete(Shape shape){
        shapes.remove(shape);
    }

    public void clear(){
        shapes.clear();
        System.out.println("-----Clear-----");
    }

}