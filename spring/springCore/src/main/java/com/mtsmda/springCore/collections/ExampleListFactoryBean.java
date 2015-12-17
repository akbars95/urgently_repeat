package com.mtsmda.springCore.collections;

import java.util.List;

/**
 * Created by c-DMITMINZ on 17.12.2015.
 */
public class ExampleListFactoryBean {

    private List<String> stringList;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}