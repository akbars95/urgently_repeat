package com.mtsmda.java7Book.ch13;

/**
 * Created by c-DMITMINZ on 11.01.2016.
 */
public class ExThreadJoin {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("here");
            }
        }, "anonymus");
        thread.start();
        thread.join();

        System.out.println("=================================");

        Thread thread1 = new Thread(new MyRun(), "T1");
        Thread thread2 = new Thread(new MyRun(), "T2");
        thread1.start();
        thread2.start();
        System.out.println("join start");
        thread2.join();
        System.out.println("complete!");
    }

}

class MyRun implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            System.out.println(Thread.currentThread().getName() + " is running - " + i + " !");
        }

    }
}

class Account{
    private double balance = 500.0D;

    public void getBalance(){
        if(balance > 0){
            balance =- 100;
        }
        System.out.println("balance = " + balance);
    }


}