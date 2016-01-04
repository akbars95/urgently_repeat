package com.mtsmda.javaQuestions.immutable;

/**
 * Created by c-DMITMINZ on 04.01.2016.
 */
public class StandardImmutableClasses {

    public static void main(String[] args) {
        String s = new String("150");
        System.out.println(s);
        getNew(s);
        System.out.println(s);

        System.out.println();

        Integer integer = new Integer(9);
        System.out.println(integer);
        getNewI(integer);
        System.out.println(integer);

        MAO mao = new MAO("NY");
        System.out.println(mao.getName());
        getNewMAO(mao);
        System.out.println(mao.getName());

        ImmutableClassPerson immutableClassPerson = new ImmutableClassPerson("Ivanov", 19);
        immutableClassPerson = new ImmutableClassPerson("Petrov", 21);
        System.out.println(immutableClassPerson.toString());

    }

    private static void getNewMAO(MAO mao){
        mao.setName(mao.getName() + " - " + "new value");
    }

    private static void getNew(String s){
        s = new String("12");
    }

    private static void getNewI(Integer integer){
        integer = new Integer(18);
    }

}

class MAO{

    private String name;

    public MAO() {

    }

    public MAO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}