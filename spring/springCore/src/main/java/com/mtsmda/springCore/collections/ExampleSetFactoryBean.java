package com.mtsmda.springCore.collections;

import java.util.Set;

/**
 * Created by c-DMITMINZ on 17.12.2015.
 */
public class ExampleSetFactoryBean {

    private Set<Double> doubleSet;

    public Set<Double> getDoubleSet() {
        return doubleSet;
    }

    public void setDoubleSet(Set<Double> doubleSet) {
        this.doubleSet = doubleSet;
    }
}