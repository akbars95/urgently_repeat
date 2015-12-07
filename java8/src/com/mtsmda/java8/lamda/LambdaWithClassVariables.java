package com.mtsmda.java8.lamda;

/**
 * Created by MTSMDA on 23.11.2015.
 */
public class LambdaWithClassVariables {

    private static int number = 1000;
    private int nonStaticNumber = 1_000_000;

    public static void main(String[] args) {
        int num = 100;

        Variable variable = () -> {
            System.out.println("local num = " + num);
            System.out.println("class number = " + number);
//            System.out.println("class number = " + nonStaticNumber);
//            num++; //error!
            number++;
            System.out.println("after modification - class number = " + number);
        };

        variable.getVariable();
        

    }

}

interface Variable{

    public void getVariable();

}