package com.mtsmda.java7Book.ch4;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class EnumEqualsMethod {

    public static void main(String[] args) {
        System.out.println(Sport.BASEBALL == Sport.ICE_HOKKEY);
        System.out.println(Sport.BASEBALL == Sport.BASEBALL);
        System.out.println(Sport.BASEBALL.equals(Sport.BASEBALL));
    }

}

enum Sport{
    FOOTBALL, BASEBALL, ICE_HOKKEY;



}