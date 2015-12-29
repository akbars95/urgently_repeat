package com.mtsmda.java7Book.ch4;

import java.io.Serializable;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class InstanceOfHTW {

    public static void main(String[] args) {
        BMW bmw = new BMW();
        System.out.println(bmw instanceof Object);
        System.out.println(bmw instanceof Transport);
        System.out.println(bmw instanceof Auto);
        System.out.println(bmw instanceof BMW);
//        System.out.println(bmw instanceof Man);

        System.out.println(null instanceof BMW);

        int i [] = new int[5];
        System.out.println(i instanceof Object);
        System.out.println(i instanceof int[]);
        int c = 15;
//        System.out.println(c instanceof Object);
        Integer g = 19;
        System.out.println(g instanceof Object);
        System.out.println(g instanceof Number);
        System.out.println(g instanceof Comparable);
        System.out.println(g instanceof Serializable);
        System.out.println(g instanceof Integer);
    }

}

interface Transport{

}

class Auto implements Transport{

}
class BMW extends Auto{

}

