package com.mtsmda.designPatterns.chain;

/**
 * Created by c-DMITMINZ on 04.01.2016.
 */
public class DatabaseLogger extends AbstractLogger{

    public DatabaseLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard database::logger " + message);
    }
}