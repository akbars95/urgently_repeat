package com.mtsmda.java7Book.ch2;

/**
 * Created by MTSMDA on 04.12.2015.
 */
public class JavaOverloading {

    public static void main(String[] args) {
        Car car = new Car();
        car.getCar();
//        car.getCar("1 - Q7");

        Car carAudi = new Audi();
        carAudi.getCar();
//        carAudi.getCar("2 - Q5");

        Audi audi = new Audi();
        audi.getCar();
        audi.getCar("3 - Q3");
    }

}

class Car {

    public void getCar() {
        System.out.println("Car simple");
    }

    /*public void getCar(String name){
        System.out.println("Car name is - " + name);
    }*/

}

class Audi extends Car {

    public void getCar() {
        System.out.println("Audi simple");
    }

    public void getCar(String name) {
        System.out.println("Audi name is - " + name);
    }

}

/*
class Person {//Error:(54, 12) java: recursive constructor invocation

    public Person() {
        this(15);
    }

    public Person(int age) {
        this();
    }

}*/
