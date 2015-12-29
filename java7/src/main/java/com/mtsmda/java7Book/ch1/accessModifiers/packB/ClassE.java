package com.mtsmda.java7Book.ch1.accessModifiers.packB;

import com.mtsmda.java7Book.ch1.accessModifiers.packA.ClassA;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class ClassE {

    public void main(){
        ClassA classA = new ClassA();
        System.out.println(classA.name);
//        System.out.println(classA.salary);
    }

}