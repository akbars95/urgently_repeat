package com.mtsmda.java7Book.ch13;

/**
 * Created by MTSMDA on 12.01.2016.
 */
public class SeveralThreads {

    public static void main(String[] args) {
        MyRunThread first = new MyRunThread("First");
        MyRunThread second = new MyRunThread("Second");


        try{
//            Thread.sleep(10000);
            System.out.println(first.name + " work - " + first.thread.isAlive());
            System.out.println(second.name + " work - " + second.thread.isAlive());
            first.thread.join();
//            Thread.sleep(5000);
            second.thread.join();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(first.name + " work - " + first.thread.isAlive());
        System.out.println(second.name + " work - " + second.thread.isAlive());
        System.out.println("Main thread complete!");
    }

}

class MyRunThread implements Runnable {

    String name;
    Thread thread;

    public MyRunThread(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("New thread, name is " + name);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 9; i >= 0; i--) {
                System.out.println("Name is " + name + " #" + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Interrupt " + name);
        }
        System.out.println("Finished " + name);
    }
}