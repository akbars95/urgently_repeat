package com.mtsmda.designPatterns.creatinal.builder.option2;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("Intel core i7, 4790K", "1Tb").setBluetoothEnabled(true).build();
        System.out.println(computer);

    }

}