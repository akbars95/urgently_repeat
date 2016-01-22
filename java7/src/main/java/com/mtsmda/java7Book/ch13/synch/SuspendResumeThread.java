package com.mtsmda.java7Book.ch13.synch;

/**
 * Created by MTSMDA on 12.01.2016.
 */
public class SuspendResumeThread {

    public static void main(String[] args) {
        NewThread newThread = new NewThread("Thread#1");
        NewThread newThread2 = new NewThread("Thread#2");

        try {
            Thread.sleep(1000);
            newThread.mySuspend();
            System.out.println(newThread.name + " suspend");

            Thread.sleep(1000);
            newThread.myResume();
            System.out.println(newThread.name + " resume");

            Thread.sleep(1000);
            newThread2.mySuspend();
            System.out.println(newThread2.name + " suspend");

            Thread.sleep(1000);
            newThread2.myResume();
            System.out.println(newThread2.name + " resume");
        } catch (InterruptedException e) {

        }

        try {
            newThread.thread.join();
            newThread2.thread.join();
        } catch (InterruptedException e) {

        }
        System.out.println("Main thread is finished");
    }

}

class NewThread implements Runnable {

    String name;
    Thread thread;
    boolean suspendFlag;

    public NewThread(String name) {
        this.name = name;
        thread = new Thread(this, this.name);
        System.out.println("new thread - " + this.name);
        suspendFlag = false;
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 25; i >= 0; i--) {
                System.out.println(Thread.currentThread().getName() + " #" + i);
                Thread.sleep(250);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {

        }
        System.out.println("Finished - " + name);
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}