package com.mtsmda.designPatterns.creatinal.factory;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer(ComputerFactory.ComputerType.PC, 24, 2, 2048, "Samsung", 4.0);
        System.out.println(computer);
    }

}