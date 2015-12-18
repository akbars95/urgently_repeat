package com.mtsmda.springCore.SpEL;

import com.mtsmda.springCore.collections.ExampleWithCollections;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Component(value = "spELCollections")
public class SpELCollections extends ExampleWithCollections{

    @Value("#{new int[]{1, 19, 253, 3520, 253155152}}")
    private Integer[] integers;

    @Value(value = "#{spELCollections.integers[1]}")
    private Integer getIndex1;

    @Value(value = "#{collections.productPrice['audi Q7']}")
    private Double map;

    @Value(value = "#{collections.genderPersons[0]}")
    private Character list;

    public Double getMap() {
        return map;
    }

    public void setMap(Double map) {
        this.map = map;
    }

    public Character getList() {
        return list;
    }

    public void setList(Character list) {
        this.list = list;
    }

    public Integer[] getIntegers() {
        return integers;
    }

    public void setIntegers(Integer[] integers) {
        this.integers = integers;
    }

    public Integer getGetIndex1() {
        return getIndex1;
    }

    public void setGetIndex1(Integer getIndex1) {
        this.getIndex1 = getIndex1;
    }
}