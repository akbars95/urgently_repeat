package com.mtsmda.java7Book.ch11.generics.genericClasses;

import com.mtsmda.java7Book.ch11.generics.model.Bird;
import com.mtsmda.java7Book.ch11.generics.model.Dog;

/**
 * Created by MTSMDA on 09.01.2016.
 */
public class RunMain {

    public static void main(String[] args) {
        FirstGenericClass<String> stringFirstGenericClass = new FirstGenericClass<>();
        stringFirstGenericClass.setOb("Hello");
        System.out.println(stringFirstGenericClass.getOb());

        System.out.println("-------------------");

        SecondTwoParam<String, Double> stringDoubleSecondTwoParam = new SecondTwoParam<>();
        stringDoubleSecondTwoParam.getTgMap().put("Bread", 3.95);
        stringDoubleSecondTwoParam.getTs().add("Bread");

        System.out.println("-------------------");

        WithRestriction<Dog> dogWithRestriction = new WithRestriction<>();
        dogWithRestriction.setT(new Dog());
        System.out.println(dogWithRestriction.getT().getClass().getCanonicalName());

//        WithRestriction<Bird> birdWithRestriction = new WithRestriction<>();
        //Error:(28, 25) java: type argument com.mtsmda.java7Book.ch11.generics.model.Bird is not within bounds of type-variable T
    }

}