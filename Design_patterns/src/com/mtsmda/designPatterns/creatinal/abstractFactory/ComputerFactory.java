package com.mtsmda.designPatterns.creatinal.abstractFactory;

import com.mtsmda.designPatterns.creatinal.factory.Computer;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }

}