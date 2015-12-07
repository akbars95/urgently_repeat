package com.mtsmda.java7Book.ch1.accessModifiers.packA;

import java.util.Date;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class ClassA {
    public String name = "Ivan";
    double salary = 15;
    protected Character gender = 'M';
    private Date dateOfBirth = new Date();

    public void print(){
        System.out.println("public = " + name);
        System.out.println("default = " + salary);
        System.out.println("protected = " + gender);
        System.out.println("private = " + dateOfBirth);
    }
}