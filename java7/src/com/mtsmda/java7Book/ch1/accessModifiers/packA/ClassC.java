package com.mtsmda.java7Book.ch1.accessModifiers.packA;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class ClassC extends ClassA{

    public static void main(String[] args) {

    }

    public void main(){
        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.salary);
    }

}