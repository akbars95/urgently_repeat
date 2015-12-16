package com.mtsmda.javaXML.jaxb;

import javax.xml.bind.annotation.XmlAnyElement;
import java.util.List;

/**
 * Created by c-DMITMINZ on 16.12.2015.
 */
public class Wrapper<T> {

    private List<T> items;

    public Wrapper() {
    }

    public Wrapper(List<T> items) {
        this.items = items;
    }

    @XmlAnyElement(lax = true)
    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}