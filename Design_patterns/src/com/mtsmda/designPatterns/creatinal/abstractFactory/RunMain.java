package com.mtsmda.designPatterns.creatinal.abstractFactory;

import com.mtsmda.designPatterns.creatinal.factory.Computer;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer(new NotebookFactory(2, 1, 500, "LG", 1.2));
        Computer computerPC = ComputerFactory.getComputer(new PCFactory(4, 2, 1000, "Sony", 3.2));
        System.out.println(computer);
        System.out.println(computerPC);
    }

}