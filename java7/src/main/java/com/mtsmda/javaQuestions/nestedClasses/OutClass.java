package com.mtsmda.javaQuestions.nestedClasses;

/**
 * Created by c-DMITMINZ on 05.01.2016.
 */
public class OutClass {

    public static class InClass {
        public void print() {
            System.out.println("s");
        }
    }

}

class RunMain {
    public static void main(String[] args) {
        OutClass.InClass inClass = new OutClass.InClass();
        inClass.print();
    }
}