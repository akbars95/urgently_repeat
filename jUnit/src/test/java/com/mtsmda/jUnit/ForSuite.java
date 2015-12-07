package com.mtsmda.jUnit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by c-DMITMINZ on 07.12.2015.
 */
public class ForSuite {

    @Test
    public void test(){
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum += i;
        }
        assertEquals(5, sum);
    }

}