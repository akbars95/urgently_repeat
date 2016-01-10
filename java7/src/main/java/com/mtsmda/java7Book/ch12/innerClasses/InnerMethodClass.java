package com.mtsmda.java7Book.ch12.innerClasses;

/**
 * Created by MTSMDA on 05.01.2016.
 */
public class InnerMethodClass {

    public static void main(String[] args) {
        Out out = new Out();
        out.doStuff();
        Out.goStatic();
    }

}


class Out {

    private double d = 19.96;
    private static boolean b = true;

    public void doStuff() {
        final String s = "some text";

        /*public */abstract class In {
            public void go() {
                System.out.println("go in inner class d - " + d + "\tb = " + Out.b + "\t s = " + s);
            }

            /*public static void he(){

            }*/
        }

        final class InFinal{
            public void goFinal(){
                System.out.println("In go final");
            }
        }

        In in = new In(){

        };
        in.go();

        new InFinal().goFinal();
    }

    public static void goStatic(){
        class InStatic{
            public void d(){
                System.out.println("this is d method!");
            }
        }

        new InStatic().d();
    }

}