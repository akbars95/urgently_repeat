package com.mtsmda.javaQuestions;

/**
 * Created by c-DMITMINZ on 15.01.2016.
 */
public class DasSolutionOutput {

    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int k = 5 - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}