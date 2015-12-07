package com.mtsmda.jUnit;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by c-DMITMINZ on 07.12.2015.
 */
public class IgnoredTest {

    /*
    * Ignores the test method. This is useful when the underlying code has been changed and the test case has not yet been adapted. Or if the execution time of this test is too long to be included. It is best practice to provide the optional description, why the test is disabled.
    * */
    @Ignore(value = "Not ready to run")
    @Test
    public void testIsIgnored() {
        System.out.println("test");
        assertEquals("test", "est");
    }

    @Test
    public void test1() {
        assertEquals("Ignored", getName());
    }

    public static String getName() {
        return "Ignored";
    }


}