package com.mtsmda.javaQuestions.multiThreding;

/**
 * Created by c-DMITMINZ on 05.01.2016.
 */
public class ExRunnable {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("s");
            }
        };
        runnable.run();
    }

}