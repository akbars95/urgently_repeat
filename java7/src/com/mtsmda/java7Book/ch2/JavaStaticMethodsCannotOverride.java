package com.mtsmda.java7Book.ch2;

/**
 * Created by MTSMDA on 06.12.2015.
 */
public class JavaStaticMethodsCannotOverride {

    public static void main(String[] args) {
        Country countries[] = new Country[]{new Country(), new City(), new Country()};
        for(Country country : countries){

        }
    }

}

class Country{

    public void getName(){
        System.out.println("Moldova");
    }

}

class City extends Country{

    public void getName(){
        System.out.println("Kishinev");
    }

}