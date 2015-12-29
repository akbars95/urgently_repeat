package com.mtsmda.java7Book.ch9.collections;

import java.util.Arrays;
import java.util.List;

/**
 * Created by c-DMITMINZ on 29.12.2015.
 */
public class ExampleArrays {

    public static void main(String[] args) {
        String [] strings = {"one", "two", "three", "fourth", "five"};
        List<String> stringList = Arrays.asList(strings);
        System.out.println("size = " + stringList.size());
        System.out.println("idx2 = " + stringList.get(2));

        stringList.set(3, "new fourth");
        strings[1] = "ten";
        System.out.println("_____strings");
        for(String s : strings){
            System.out.println(s);
        }

        System.out.println("_____stringList");
        for(String s : stringList){
            System.out.println(s);
        }

        Object[] objects = stringList.toArray();
        System.out.println("_____objects");
        for(Object o : objects){
            System.out.println(o);
        }

        String [] strings1 = new String[stringList.size() - 2];
        strings1 = stringList.toArray(strings1);
        System.out.println("_____strings1");
        for(String s : strings1){
            System.out.println(s);
        }
        System.out.println("\t\tdone");

        strings1 = new String[stringList.size() + 10];
        strings1 = stringList.toArray(strings1);
        System.out.println("_____strings1");
        for(String s : strings1){
            System.out.println(s);
        }
        System.out.println("done");

    }

}