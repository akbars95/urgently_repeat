package com.mtsmda.java7Book.ch11.generics.genericClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MTSMDA on 09.01.2016.
 */
public class SecondTwoParam<T, G> {

    public List<T> ts = new ArrayList<>();
    public Map<T, G> tgMap = new HashMap<>();

    public List<T> getTs() {
        return ts;
    }

    public void setTs(List<T> ts) {
        this.ts = ts;
    }

    public Map<T, G> getTgMap() {
        return tgMap;
    }

    public void setTgMap(Map<T, G> tgMap) {
        this.tgMap = tgMap;
    }
}