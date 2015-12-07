package com.mtsmda.java8.linkMethod;

/**
 * Created by MTSMDA on 26.11.2015.
 */
public class LinkToConstructor {

    public static void main(String[] args) {

        MyConstructorInterface myConstructorInterface = MyClassConstructor::new;
        MyClassConstructor myClassConstructor = myConstructorInterface.getConstructor(15);
        System.out.println(myClassConstructor.getValue());

        MyFunction<MyClassConst<Double>, Double> myClassDoubleMyFunction = MyClassConst<Double>::new;
        MyClassConst<Double> doubleMyClassConst = myFactory(myClassDoubleMyFunction, 100.159);
        System.out.println(doubleMyClassConst.getT());

    }

    private static <R, T> R myFactory(MyFunction<R, T> rtMyFunction, T t) {
        return rtMyFunction.funct(t);
    }

}

class MyClassConstructor {

    private int value;

    public MyClassConstructor(int value) {
        this.value = value;
    }

    public MyClassConstructor() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

interface MyConstructorInterface {

    public MyClassConstructor getConstructor(int value);

}

interface MyFunction<R, T> {

    public R funct(T t);

}

class MyClassConst<T> {

    private T t;

    public MyClassConst(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}

class MyClassConst2 {
    private String string;

    public MyClassConst2(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}