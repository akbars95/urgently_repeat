package com.mtsmda.java7Book.ch9;

/**
 * Created by c-DMITMINZ on 29.12.2015.
 *
 *
 *
 *
 *
 *
 *
 *
 * Yikes! The equals() method seems to be working, but what happened with ==
 and !=? Why is != telling us that i1 and i2 are different objects, when == is saying
 that i3 and i4 are the same object? In order to save memory, two instances of the
 following wrapper objects (created through boxing) will always be == when their
 primitive values are the same:
 ■ Boolean
 ■ Byte
 ■ Character from \u0000 to \u007f (7f is 127 in decimal)
 ■ Short and Integer from –128 to 127
 When == is used to compare a primitive to a wrapper, the wrapper will be
 unwrapped and the comparison will be primitive to primitive.
 *
 *
 */
public class WrapperObjectsAndEquals {

    public static void main(String[] args) {
        integer();
        booleanI();
        byteI();
    }

    private static void byteI() {
        Byte aByte = 127;
        Byte bByte = 127;
        System.out.println("aByte == bByte = " + (aByte == bByte));
        System.out.println("aByte.equals(bByte) = " + aByte.equals(bByte));
        System.out.println("_______________________");

        aByte = -128;
        bByte = -128;
        System.out.println("aByte == bByte = " + (aByte == bByte));
        System.out.println("aByte.equals(bByte) = " + aByte.equals(bByte));
        System.out.println("_______________________");
    }

    private static void booleanI() {
        Boolean aBoolean = false;
        Boolean aBoolean1 = false;
        System.out.println("aBoolean == aBoolean1 = " + (aBoolean == aBoolean1));
        System.out.println("aBoolean.equals(aBoolean1) = " + aBoolean.equals(aBoolean1));
        System.out.println("_______________________");
    }

    private static void integer() {
        Integer integer = 1000;
        Integer integer1 = 1000;
        System.out.println("integer == integer = " + (integer == integer1));
        System.out.println("integer.equals(integer1) = " + integer.equals(integer1));
        System.out.println("_______________________");
        integer = 128;
        integer1 = 128;
        System.out.println("integer == integer = " + (integer == integer1));
        System.out.println("integer.equals(integer1) = " + integer.equals(integer1));
        System.out.println("_______________________");
        integer = 127;
        integer1 = 127;
        System.out.println("integer == integer = " + (integer == integer1));
        System.out.println("integer.equals(integer1) = " + integer.equals(integer1));
        System.out.println("_______________________");
        integer = -128;
        integer1 = -128;
        System.out.println("integer == integer = " + (integer == integer1));
        System.out.println("integer.equals(integer1) = " + integer.equals(integer1));
        System.out.println("_______________________");
        integer = -129;
        integer1 = -129;
        System.out.println("integer == integer = " + (integer == integer1));
        System.out.println("integer.equals(integer1) = " + integer.equals(integer1));
        System.out.println("_______________________");
    }

}