package com.mtsmda.javaQuestions.defaultValues;

/**
 * Created by c-DMITMINZ on 07.12.2015.
 */
public class DefaultValuesInClass {

    private static String name;
    private static int age;
    private DefaultValuesInClass defaultValuesInClass;

    static {
        System.out.println("=====Static Init=====");
        System.out.println(age);
        System.out.println(name);
        System.out.println("===== =====");
    }

    {
        System.out.println("=====Init=====");
        System.out.println(age);
        System.out.println(name);
        System.out.println("===== =====");
    }

    public DefaultValuesInClass() {
        System.out.println("=====Constructor=====");
        System.out.println(age);
        System.out.println(name);
        System.out.println("===== =====");
    }

    @Override
    public String toString() {
        return "Name = " + name + "\nage = " + age;
    }
}