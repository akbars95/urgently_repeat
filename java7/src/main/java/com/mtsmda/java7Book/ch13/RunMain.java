package com.mtsmda.java7Book.ch13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by c-DMITMINZ on 10.01.2016.
 */
public class RunMain {

    public static void main(String[] args) {
        CreateThreadExtends createThreadExtends = new CreateThreadExtends();
        createThreadExtends.setName("Extends");
        createThreadExtends.start();


        CreateThreadImpl createThread = new CreateThreadImpl();
        Thread thread = new Thread(createThread, "Implement");
        thread.start();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymus!");
            }
        }, "Anonym");
        thread1.start();

        System.out.println("___________________________________");
        Thread thread2 = new Thread(new FooRunnable(), "Thread - 2");
        Thread thread3 = new Thread(new FooRunnable(), "Thread - 3");
        Thread thread4 = new Thread(new FooRunnable(), "Thread - 4");

        thread2.start();
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.start();
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread4.start();
        thread4.setPriority(Thread.MAX_PRIORITY);

        Thread thread5 = new Thread(new MyTimer(), "Timer");
        /*thread5.start();
        thread5.setPriority(10);*/
    }

}

class FooRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 5, c = 20; i < 15 && c > 15; i++, c--) {
            System.out.println("Name is - " + Thread.currentThread().getName() + "\t\tRun - i = " + i + "\tc = " + c);
        }
    }
}

class MyTimer implements Runnable {
    @Override
    public void run() {
        try {
            for (; true; ) {
                DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:S dd.MM.yyyy");
                System.out.println(Thread.currentThread().getName() + "_____" + dateFormat.format(new Date()));
                System.out.println(Thread.currentThread().getPriority());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}