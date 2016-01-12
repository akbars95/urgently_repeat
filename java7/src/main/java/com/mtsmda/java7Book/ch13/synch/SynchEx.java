package com.mtsmda.java7Book.ch13.synch;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by MTSMDA on 12.01.2016.
 */
public class SynchEx {

    public static void main(String[] args) {
        CallMe callMe = new CallMe();
        Caller caller = new Caller(callMe, "Welcome!");
        Caller caller1 = new Caller(callMe, "Hello Ion");
        Caller caller2 = new Caller(callMe, "Ivanov");
        try {
            caller.thread.join();
            caller1.thread.join();
            caller2.thread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getClass().getCanonicalName());
        }
    }

}

class CallMe {

    /*synchronized*/ void call(String message) {
        System.out.print("[" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getClass().getCanonicalName());
        }
        System.out.println("]");
    }

}

class Caller implements Runnable {

    String message;
    CallMe callMe;
    Thread thread;

    public Caller(CallMe callMe, String message) {
        this.callMe = callMe;
        this.message = message;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        synchronized (callMe) {
            this.callMe.call(this.message);
        }
    }
}