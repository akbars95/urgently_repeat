package com.mtsmda.java7Book.ch3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class PassVariableToMethods {

    public static void main(String[] args) {
        int c = 19;
        primitive(c);
        System.out.println(c);

        Double d = 251.255;
        wrapper(d);
        System.out.println(d);

        String hi = "hi";
        wrapperString(hi);
        System.out.println(hi);

        StringBuilder stringBuilder = new StringBuilder("stb");
        System.out.println(stringBuilder);
        wrapperStringB(stringBuilder);
        System.out.println(stringBuilder);
        stringBuilder = wrapperStringB(stringBuilder);
        System.out.println(stringBuilder);
        wrapperStringBAppend(stringBuilder);
        System.out.println(stringBuilder);

        int cc[] = new int[5];
        System.out.println("\n\nbefore");
        for (int ccc : cc) {
            System.out.println(ccc);
        }
        System.out.println("\n\nafter");
        array(cc);
        for (int ccc : cc) {
            System.out.println(ccc);
        }


        City city = new City();
        city.name = "Kishinev";
        otherClass(city);
        System.out.println("after = " + city.name);

        Collection<String> strings = new ArrayList<>();
        strings.add("First");
        System.out.println(strings);
        collections(strings);
        System.out.println(strings);
    }

    public static void collections(Collection<String> collection) {
        collection.add("String");
    }

    public static void otherClass(City c) {
        c.name = "Belicy";
    }

    public static void array(int[] c) {
        c[2] = 19;
    }

    public static void primitive(int c) {
        c = 15;
    }

    public static void wrapper(Double aDouble) {
        aDouble = 19.0;
    }

    public static void wrapperString(String s) {
        s = "wrapperString";
    }

    public static StringBuilder wrapperStringB(StringBuilder s) {
        s = new StringBuilder("wrapperStringB");
        return s;
    }

    public static void wrapperStringBAppend(StringBuilder s) {
        s.append("append");
    }

}

class City{
    public String name;


}