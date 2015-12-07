package com.mtsmda.java8.linkMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by MTSMDA on 25.11.2015.
 */
public class LinkToGenericMethods {

    public static void main(String[] args) {
        int count = 0;

        Integer[] integers = new Integer[]{19, 16, 1872, 13, 10, 13};
        String[] strings = new String[]{"text", "have a nice day", "text", "have a nice day", "text", "thank you", "hi", "hello"};

        System.out.println(myOp(MyArrayOp::<String>myArrayFunc, strings, "text"));

        System.out.println(myOp(MyArrayOp::<Integer>myArrayFunc, integers, 10));

        //
        List<MyClass> myClasses = new ArrayList<>();
        myClasses.add(new MyClass(19));
        myClasses.add(new MyClass(300));
        myClasses.add(new MyClass(750));
        myClasses.add(new MyClass(12350));
        myClasses.add(new MyClass(9));

        MyClass myClassMax = Collections.max(myClasses, MyComparator::comparator);
        System.out.println(myClassMax.getValue());


    }

    private static <T> int myOp(MyFunc<T> tMyFunc, T[] ts, T t){
        return tMyFunc.myFunc(ts, t);
    }

}

interface MyFunc<T>{

    public int myFunc(T[] ts, T t);

}

class MyArrayOp{

    public static <T> int  myArrayFunc(T[] ts, T t){
        int countSame = 0;
        for (T t1 : ts){
            if(t1.equals(t)){
                countSame++;
            }
        }
        return countSame;
    }

}

class MyClass{
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class MyComparator{

    public static int comparator(MyClass myClass1, MyClass myClass2){
        return myClass1.getValue() - myClass2.getValue();
    }

}