package com.mtsmda.java7Book.ch2;

/**
 * Created by MTSMDA on 06.12.2015.
 */
public class JavaConstructorsInheritance {

    public static void main(String[] args) {

    }

}

class ConA{

    public ConA(int age){
        System.out.println(age);
    }

}

/*
class ConB extends ConA{
//Error:(22, 1) java: constructor ConA in class com.mtsmda.java7Book.ch2.ConA cannot be applied to given types;
//    required: int
//    found: no arguments
//    reason: actual and formal argument lists differ in length
}*/
