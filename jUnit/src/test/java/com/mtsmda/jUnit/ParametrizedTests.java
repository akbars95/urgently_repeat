package com.mtsmda.jUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by c-DMITMINZ on 07.12.2015.
 */
@RunWith(Parameterized.class)
public class ParametrizedTests {

    private int numberA;
    private int numberB;
    private int expected;

    public ParametrizedTests(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: multiply({0}*{1})={2}")
    public static Iterable<Object[]> datas() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {5, 10, 50},
                {10, 7, 70},
                {25, 20, 500},
                {1, 3, 3}
        });
    }

    @Test
    public void test_multiply() {
        assertEquals(expected, MyClassMathUtils.multiply(numberA, numberB));
    }

}