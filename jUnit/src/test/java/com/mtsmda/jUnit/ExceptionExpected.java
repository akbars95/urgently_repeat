package com.mtsmda.jUnit;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by c-DMITMINZ on 07.12.2015.
 */
public class ExceptionExpected {

    /**
     * Fails if the method does not throw the named exception.
     * */
    @Ignore("Ignore, because tests falled")
    @Test(expected = ArithmeticException.class)
    public void divisionWithException(){
        int i = 1 / 0;
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithoutException(){
        int i = 1 / 1;
    }

}
