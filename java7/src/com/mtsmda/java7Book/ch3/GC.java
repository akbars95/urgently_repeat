package com.mtsmda.java7Book.ch3;

import java.util.GregorianCalendar;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class GC {

    public static void main(String[] args) {
        SQL sql = new SQL("MS SQL");
        System.out.println(sql);
        /*try {
            sql.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }*/
        sql = null;
        System.gc();
        System.out.println("hello w");

        System.out.println("------------------------------");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total JVM memory - " + runtime.totalMemory());
        System.out.println("Free memory before - " + runtime.freeMemory());
        for (int i = 0; i < 1_000; i++){
            sql = new SQL("MS" + i);
            System.out.println(sql);
            sql = null;
        }
        System.out.println("Free memory after created objects - " + runtime.freeMemory());
        System.gc();
        System.out.println("Free memory after gc - " + runtime.freeMemory());

        System.out.println("CPUs = " + runtime.availableProcessors());
        System.out.println("MAX memory = " + runtime.maxMemory());

    }

}

class SQL {

    private String name;

    public SQL(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SQL{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize()");
    }
}