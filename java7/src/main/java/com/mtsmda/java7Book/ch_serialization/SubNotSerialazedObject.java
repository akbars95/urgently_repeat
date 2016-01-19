package com.mtsmda.java7Book.ch_serialization;

import java.io.Serializable;

/**
 * Created by c-DMITMINZ on 18.01.2016.
 */
public class SubNotSerialazedObject extends NotSerialazedObject implements Serializable {

    public SubNotSerialazedObject() {

    }

    public SubNotSerialazedObject(String name, Integer age) {
        super(name, age);
    }
}
