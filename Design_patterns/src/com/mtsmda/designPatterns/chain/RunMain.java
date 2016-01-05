package com.mtsmda.designPatterns.chain;

/**
 * Created by c-DMITMINZ on 05.01.2016.
 */
public class RunMain {

    private static AbstractLogger get() {
        AbstractLogger abstractLoggerError = new DatabaseLogger(AbstractLogger.ERROR);
        AbstractLogger abstractLoggerFile = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger abstractLoggerConsole = new ConsoleLogger(AbstractLogger.INFO);

        abstractLoggerError.setNextLogger(abstractLoggerFile);
        abstractLoggerFile.setNextLogger(abstractLoggerConsole);

        return abstractLoggerError;

    }

    public static void main(String[] args) {
        AbstractLogger abstractLogger = get();

        abstractLogger.logMessage(AbstractLogger.INFO, "This is information");
        System.out.println("---------------");
        abstractLogger.logMessage(AbstractLogger.DEBUG, "This is debug");
        System.out.println("---------------");
        abstractLogger.logMessage(AbstractLogger.ERROR, "This is error");

    }

}