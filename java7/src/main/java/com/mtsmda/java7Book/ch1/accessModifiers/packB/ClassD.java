package com.mtsmda.java7Book.ch1.accessModifiers.packB;

import com.mtsmda.java7Book.ch1.accessModifiers.packA.ClassA;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class ClassD extends ClassA{

    public void print(){
        System.out.println(this.gender);
        System.out.println(this.name);
//        System.out.println(this.salary);
    }

}