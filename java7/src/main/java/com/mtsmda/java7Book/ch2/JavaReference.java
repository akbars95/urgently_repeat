package com.mtsmda.java7Book.ch2;

/**
 * Created by MTSMDA on 04.12.2015.
 */
public class JavaReference {

    public static void main(String[] args) {
        Object o = new ClassB();
        System.out.println(o.getClass().getCanonicalName());
        ((ClassB)o).print();

        InterfaceC interfaceC = new ClassB();
        System.out.println(interfaceC.getClass().getCanonicalName());
        interfaceC.print();

        ClassA classA = new ClassB();
        System.out.println(classA.getClass().getCanonicalName());
        classA.print();

        ClassB classB = new ClassB();
        System.out.println(classB.getClass().getCanonicalName());
        classB.print();

    }

}

class ClassA {

    public void print(){
        System.out.println(this.getClass().getCanonicalName() + " = " + this.getClass().getDeclaredMethods()[0].getName());
    }

}

class ClassB extends ClassA implements InterfaceC{

    public void print(){
        System.out.println(this.getClass().getCanonicalName() + " = " + this.getClass().getDeclaredMethods()[0].getName());
    }

}

interface InterfaceC{

    public void print();

}