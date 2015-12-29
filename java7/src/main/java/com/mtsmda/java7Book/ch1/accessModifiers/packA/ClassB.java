package com.mtsmda.java7Book.ch1.accessModifiers.packA;

import java.util.Date;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class ClassB {

    public static void main(String[] args) {
        new ClassA().print();
        ClassA classA = new ClassA();
        System.out.println(classA.salary);

    }

    public void main(){

    }

}