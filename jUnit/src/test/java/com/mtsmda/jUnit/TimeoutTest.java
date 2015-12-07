package com.mtsmda.jUnit;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by c-DMITMINZ on 07.12.2015.
 */
public class TimeoutTest {

    /***
     * Fails if the method takes longer than 100 milliseconds.
     */
//    @Ignore
    @Test(timeout = 1000)
    public void infinity() {
        for (; true; ) ;
    }

    @Test(timeout = 17500)
    public void bigTest() {
        for (int i = 0; i <= 1_000_000; i++) {
//            System.out.println(i);
        }
    }

}