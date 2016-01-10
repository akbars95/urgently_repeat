package com.mtsmda.java7Book.ch13;

/**
 * Created by c-DMITMINZ on 10.01.2016.
 */
public class CreateThreadExtends extends Thread {

    @Override
    public void run() {
        System.out.println("hello from thread!");
    }
}