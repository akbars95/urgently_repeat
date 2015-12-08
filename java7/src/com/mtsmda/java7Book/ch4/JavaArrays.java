package com.mtsmda.java7Book.ch4;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class JavaArrays {

    public static void main(String[] args) {
        int[][] p = null;
        System.out.println(p == null);
        p = new int[3][];
        for (int[] g : p) {
            g = new int[p.length + 1];
            System.out.println(g.length);
        }

        double[] dd = {19D, 135.25};
        System.out.println(dd.length);

        printArray(new int[][]{
                {19, 255, 9614},
                {53},
                {9423, 214}
        });

        CarName[] cars = new Car[]{new Car(), new Ferrari(), new Mazda()};
        for (CarName car : cars) {
            car.getName();
        }

        System.out.println();

        Object[] objects = {new Object(), new String(), new Car(), new String[][][]{}};
        for (Object o : objects) {
            System.out.print(o.getClass().getCanonicalName() + "\t");
        }


    }

    private static void printArray(int[][] ar) {
        for (int[] first : ar) {
            for (int second : first) {
                System.out.print(second + " --- ");
            }
            System.out.println();
        }
    }

}

interface CarName {
    public void getName();
}

class Car implements CarName {

    @Override
    public void getName() {
        System.out.println("Simple Car");
    }
}

class Ferrari extends Car {

    @Override
    public void getName() {
        System.out.println("Ferrari");
    }

}

class Mazda extends Car {

    @Override
    public void getName() {
        System.out.println("Mazda");
    }

}