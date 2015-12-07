package com.mtsmda.jUnit;

import org.junit.*;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by c-DMITMINZ on 07.12.2015.
 */
public class BasicUsage {

    private Collection<String> collection;
    private static int count = 0;

    /***
     * This method is executed once, before the start of all tests. It is used to perform time intensive activities, for example, to connect to a database. Methods marked with this annotation need to be defined as static to work with JUnit.
     */
    @BeforeClass
    public static void onTimeSetup() {
        System.out.println("@BeforeClass - " + (++count));
    }

    /**
     * This method is executed once, after all tests have been finished. It is used to perform clean-up activities, for example, to disconnect from a database. Methods annotated with this annotation need to be defined as static to work with JUnit.
     * */
    @AfterClass
    public static void onTimeTearDown() {
        System.out.println("@AfterClass - " + (++count));
    }

    /**
     * This method is executed before each test. It is used to prepare the test environment (e.g., read input data, initialize the class).
     */
    @Before
    public void setup() {
        System.out.println("@Before - " + (++count));
        collection = new ArrayList<String>();
    }

    /**
     * This method is executed after each test. It is used to cleanup the test environment (e.g., delete temporary data, restore defaults). It can also save memory by cleaning up expensive memory structures.
     */
    @After
    public void tearDown() {
        System.out.println("@After - " + (++count));
        collection.clear();
    }

    @Test
    public void test1() {
        System.out.println("@Test - " + (++count));
//        collection.add(new String("Ivan"));
        assertTrue(collection.isEmpty());
    }

    /**
     * The @Test annotation identifies a method as a test method.
     */
    @Test
    public void test2() {
        System.out.println("@Test - " + (++count));
        collection.add(new String("Ivan"));
        assertEquals(1, collection.size());
    }

}
