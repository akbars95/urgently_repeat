package com.mtsmda.designPatterns.structural.composite.option1;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        Shape shapeCircle = new Circle();
        Shape shapeTriangle = new Triangle();
        Shape shapeCircle1 = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(shapeCircle);
        drawing.add(shapeCircle1);
        drawing.add(shapeTriangle);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(new Triangle());
        drawing.add(new Triangle());
        drawing.add(new Triangle());
        drawing.add(new Triangle());
        drawing.add(new Triangle());
        drawing.add(new Circle());
        drawing.add(new Circle());

        drawing.draw("Green");
    }

}