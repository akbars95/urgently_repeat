package com.mtsmda.javaQuestions.staticMethodsInheritance;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class ClassSecond extends ClassFirst{
    public void print(){
        System.out.println(className);
        System.out.println(getClassName());
    }
}