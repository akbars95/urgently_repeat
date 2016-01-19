package com.mtsmda.javaQuestions;

/**
 * Created by c-DMITMINZ on 14.01.2016.
 */
public class FactorialEx {
/**
 * https://www.youtube.com/watch?v=neuDuf_i8Sg
 * */
    public static void main(String[] args) {
        System.out.println(factorialRec(5));
        System.out.println(factorialRec(1));
        System.out.println(factorialRec(0));
//        System.out.println(factorialRec(-5));

        System.out.println(factorialWithoutRec(5));

    }

    private static int factorialRec(int n){
        if(n == 0){
            return 1;
        }
        return n * factorialRec(n-1);
    }

    private static int factorialWithoutRec(int n){
        int sum = 1;

        for (int i = 1; i <= n; ++i){
            sum *= i;
        }

        return sum;
    }

}