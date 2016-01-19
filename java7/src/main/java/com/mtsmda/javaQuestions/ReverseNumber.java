package com.mtsmda.javaQuestions;

/**
 * Created by c-DMITMINZ on 15.01.2016.
 */
public class ReverseNumber {

    public static void main(String[] args) {
        first();
        System.out.println("second = " + second(15283) + " - " + 15283);
    }

    private static void first() {
        Integer integer = 19253;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(integer).reverse();
        System.out.println(stringBuilder);
    }

    private static int second(int number){
        int result = 0;
        while (number != 0){
            result = (result * 10) + (number % 10);
            number /= 10;
        }
        return result;
    }

}