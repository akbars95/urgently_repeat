package com.mtsmda.jUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;

/**
 * Created by c-DMITMINZ on 07.12.2015.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ForSuite.class,
        BasicUsage.class,
        ExceptionExpected.class
})
public class SuiteTestsRun {


}