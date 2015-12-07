package com.mtsmda.java8.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/**
 * Created by MTSMDA on 27.11.2015.
 */
public class StandartFI {

    public static void main(String[] args) {
        UnaryOperator<Integer> integerUnaryOperator = (n) -> {
            return 19 * n;
        };

        System.out.println(integerUnaryOperator.apply(10));
        System.out.println(UnaryOperator.identity());

        Consumer<String> stringConsumer = (str) -> {
            System.out.println("Hello, " + str + "!");
        };
        stringConsumer.accept("Ivan");

    }

}