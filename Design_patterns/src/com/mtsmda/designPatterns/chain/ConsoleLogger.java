package com.mtsmda.designPatterns.chain;

/**
 * Created by c-DMITMINZ on 04.01.2016.
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard console::logger " + message);
    }
}