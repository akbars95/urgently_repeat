package com.mtsmda.java7Book.ch2;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by MTSMDA on 04.12.2015.
 */
public class JavaOverriding {

    public static void main(String[] args) {

        SuperClass superClass = new SuperClass();
        superClass.method("Ivan");
        SubClass subClass = new SubClass();
        subClass.method();
        subClass.method("Vasya");
        SuperClass superClass1 = new SubClass();
        superClass1.method("Iasha", 30);

        superClass1.runtimeException();

        SuperClass.print(19.3);
        SubClass.print(15.);

        System.out.println("------------------------------------------");
        array(new Integer[]{19, 25});
        array(new int[]{19, 25});
        integ(19);
        integ(new Integer(1932));
//        integ(19, 158);
//        integ(new Integer(1932), new Integer(2156));

    }

    private static void array(Integer ... integers){
        System.out.println("Integer ... integers");
    }

    private static void array(int[] integers){
        System.out.println("int[] integers");
    }

    private static void integ(int integer){
        System.out.println("int integer");
    }

    private static void integ(Integer integer){
        System.out.println("Integer integer");
    }

    private static void integ(Integer ... integers){
        System.out.println("Integer ... integers");
    }

    private static void integ(int ... integers){
        System.out.println("int ... integers");
    }

}

class SuperClass {

    private void method() {
        System.out.println(this.getClass().getCanonicalName() + "." + this.getClass().getDeclaredMethods()[0].getName());
    }

    protected void method(String name) {
        System.out.println("=====");
        System.out.println("Name is - " + name);
        System.out.println(this.getClass().getCanonicalName() + "." + this.getClass().getDeclaredMethods()[0].getName());
        System.out.println("=====");
    }

    void method(String name, Integer age) {
        System.out.println("=====");
        System.out.println("Name is - " + name + ", age = " + age);
        System.out.println(this.getClass().getCanonicalName() + "." + this.getClass().getDeclaredMethods()[0].getName());
        System.out.println("=====");
    }

    public SuperClass get() {
        return new SuperClass();
    }

    public void runtimeException() throws RuntimeException {
        System.out.println("runtimeException");
    }

    public void runtimeExceptionSubClass() throws RuntimeException {
        System.out.println("runtimeException");
    }

    public void runtimeExceptionSuper() throws RuntimeException {
        System.out.println("runtimeException");
    }

    public void subClassRuntimeException() throws SubClassRuntimeException {
        System.out.println("SubClassRuntimeException");
    }

    public void subSubClassRuntimeException() throws SubSubClassRuntimeException {
        System.out.println("SubClassRuntimeException");
    }

    public void exFileNotFoundException() throws FileNotFoundException {
        System.out.println("exFileNotFoundException");
    }

    public void exSubFileNotFoundException() throws FileNotFoundException {
        System.out.println("exSubFileNotFoundException");
    }

    public void withoutException() throws Exception {
        System.out.println("withoutException");
    }

    public static void print(Double moneyCount){
        System.out.println("moneyCount - " + moneyCount);
    }

}

class SubClass extends SuperClass {
    protected void method() {
        System.out.println(this.getClass().getCanonicalName() + "." + this.getClass().getDeclaredMethods()[0].getName());
    }

    /*private*/
    public void method(String name) {
        System.out.println("=====");
        System.out.println("Name is - " + name);
        System.out.println(this.getClass().getCanonicalName() + "." + this.getClass().getDeclaredMethods()[0].getName());
        System.out.println("=====");
    }

    /*private */
    protected void method(String name, Integer age) {
        System.out.println("=====");
        System.out.println("Name is - " + name + ", age = " + age);
        System.out.println(this.getClass().getCanonicalName() + "." + this.getClass().getDeclaredMethods()[0].getName());
        System.out.println("=====");
    }

    public SubClass get() {
        return new SubClass();
    }

    public void runtimeException() throws RuntimeException {
        System.out.println("runtimeException2");
    }

    public void runtimeExceptionSubClass() throws SubClassRuntimeException {
        System.out.println("runtimeException");
    }

    /*public void runtimeExceptionSuper() throws Exception{
        System.out.println("runtimeException");
    }*/

    public void subClassRuntimeException() throws SubSubClassRuntimeException {
        System.out.println("SubClassRuntimeException");
    }

    public void subSubClassRuntimeException() throws SubClassRuntimeException {
        System.out.println("SubClassRuntimeException");
    }

    /*public void exFileNotFoundException() throws IOException{
        System.out.println("exFileNotFoundException");
    }*/

    public void exSubFileNotFoundException() throws SubFileNotFoundException {
        System.out.println("exSubFileNotFoundException");
    }

    public void withoutException() {
        System.out.println("withoutException");
    }

    /*private*/ public static void print(Double moneyCount){
        System.out.println("moneyCount2 - " + moneyCount);
        SuperClass.print(moneyCount);
    }

}

class SubClassRuntimeException extends RuntimeException {

    public SubClassRuntimeException() {
        System.out.println("SubClassRuntimeException");
    }
}

class SubSubClassRuntimeException extends SubClassRuntimeException {

    public SubSubClassRuntimeException() {
        System.out.println("SubSubClassRuntimeException");
    }
}

class SubFileNotFoundException extends FileNotFoundException {

    public SubFileNotFoundException() {
        System.out.println("SubFileNotFoundException");
    }
}