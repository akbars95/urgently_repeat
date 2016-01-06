package com.mtsmda.java7Book.ch12.innerClasses;

/**
 * Created by MTSMDA on 05.01.2016.
 */
public class AnonymousClasses {

    public static void main(String[] args) {
        Vneshnii vneshnii = new Vneshnii();
        Popcorn popcorn = vneshnii.popcorn;
        popcorn.getPopcorn();

        vneshnii.cookable.cook("Ivan");
    }

}

class Vneshnii {

    public Popcorn popcorn = new Popcorn() {
        @Override
        public void getPopcorn() {
            System.out.println("anonymous class");
            get();
        }

        public void get() {
            System.out.println("here");
        }

    };

    public Cookable cookable = new Cookable() {
        @Override
        public void cook(String name) {
            System.out.println("cook name is " + name);
            hi();
        }

        public void hi() {
            System.out.println("Hi! cook!");
        }
    };

}

class Popcorn {

    public void getPopcorn() {
        System.out.println("take popcorn!");
    }

}

interface Cookable {

    public void cook(String name);

}