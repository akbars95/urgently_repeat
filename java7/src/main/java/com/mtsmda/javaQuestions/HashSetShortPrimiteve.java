package com.mtsmda.javaQuestions;

import java.util.HashSet;

/**
 * Created by c-DMITMINZ on 15.01.2016.
 */
public class HashSetShortPrimiteve {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        for(short i = 0; i < 100; i++){
            hashSet.add(i);
            hashSet.remove(i - 1);
        }
        System.out.println("lenght - " + hashSet.size());

        for (Object o : hashSet){
            System.out.println(o + " - " + o.hashCode());
        }


    }

}