package com.mtsmda.designPatterns.chain;

/**
 * Created by c-DMITMINZ on 04.01.2016.
 */
public class FileLogger extends AbstractLogger{

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard file::logger " + message);
    }
}