package com.mtsmda.jUnit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by c-DMITMINZ on 07.12.2015.
 */
public class MyTests {

    @Test
    public void testMyClass(){
        MyClassMathUtils myClass = new MyClassMathUtils();
        assertEquals(10, 0, myClass.multiply(2, 5));
    }

}