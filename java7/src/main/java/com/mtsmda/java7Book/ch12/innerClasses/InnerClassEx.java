package com.mtsmda.java7Book.ch12.innerClasses;

/**
 * Created by MTSMDA on 05.01.2016.
 */
public class InnerClassEx {

    public static void main(String[] args) {
        ClassOuter classOuter = new ClassOuter();
        ClassOuter.ClassInner classInner = classOuter.new ClassInner();
        classInner.print();

        ClassOuter.ClassInner classInner1 = new ClassOuter().new ClassInner();
        classInner1.print();
    }

}

class ClassOuter {

    public class ClassInner {

        void print() {
            System.out.println("inner");
        }

    }

}