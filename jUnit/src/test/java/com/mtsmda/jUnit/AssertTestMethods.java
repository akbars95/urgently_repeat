package com.mtsmda.jUnit;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * Created by c-DMITMINZ on 07.12.2015.
 */
@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
public class AssertTestMethods {

    /**
     * Let the method fail. Might be used to check that a certain part of the code is not reached or to have a failing test before the test code is implemented. The message parameter is optional.
     */
    @Test
    public void test(){
        fail("test is fall!");
    }

    /**
     * Checks that the boolean condition is true.
     * */
    @Test
    public void testAssertTrue(){
        assertTrue("2 > 3?", 2 > 3);
    }

    /**
     * Checks that the boolean condition is false.
     * */
    @Test
    public void testAssertFalse(){
        assertFalse("2 < 3?", 2 < 3);
    }

    /**
     * Tests that two values are the same. Note: for arrays the reference is checked not the content of the arrays.
     * */
    @Test
    public void testAssertEquals(){
        assertEquals("Dmitri equals dmitri", true, "Dmitri".equals("dmitri"));
    }

    /**
     * Test that float or double values match. The tolerance is the number of decimals which must be the same.
     * */
    @Test
    public void testAssertEqualsTolerance(){
        assertEquals("Dmitri equals dmitri", 15.9, 17.5 - 1.6115, 0.0);
    }

    /**
     * Checks that the object is null.
     * */
    @Test
    public void testAssertNull(){
        assertNull("String should be null", new String(""));
    }

    /**
     * Checks that the object is not null.
     * */
    @Test
    public void testAssertNotNull(){
        assertNotNull("String should be not null", null);
    }

    /**
     * Checks that both variables refer to the same object.
     * */
    @Test
    public void testAssertSame(){
        assertSame("null == null", null, null);
        assertSame("null == string?", null, new String());
    }

    /**
     * Checks that both variables refer to different objects.
     * */
    @Test
    public void testAssertNotSame(){
        assertNotSame("null != null?", null, null);
        assertNotSame("null != string", null, new String());
    }

}