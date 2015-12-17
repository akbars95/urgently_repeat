package com.mtsmda.springCore.collections;

import java.util.List;
import java.util.Map;

/**
 * Created by c-DMITMINZ on 17.12.2015.
 */
public class ExampleMapFactoryBean {

    private Map<String, String> stringStringMap;

    public Map<String, String> getStringStringMap() {
        return stringStringMap;
    }

    public void setStringStringMap(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }
}