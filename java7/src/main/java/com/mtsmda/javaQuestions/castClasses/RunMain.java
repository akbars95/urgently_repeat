package com.mtsmda.javaQuestions.castClasses;

/**
 * Created by c-DMITMINZ on 05.01.2016.
 */
public class RunMain {

    public static void main(String[] args) {
        Country country = new Country();
        City city = new City();
//        City city1 = (City)country;
//        city1.get();

        Country country1 = new City();
        System.out.println(country1.get());

        Country country2 = city;
        System.out.println(country2.get());

        City city2 = (City)country1;
        System.out.println(city2.get());
        System.out.println(((City)country1).get());
    }

}