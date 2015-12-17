package com.mtsmda.springCore.dependenciesCheking;

import com.mtsmda.springCore.Person;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by MTSMDA on 17.12.2015.
 */
public class MyClassDC {

    private Person person;
    private String name;
    private int count;

    public MyClassDC() {

    }

    public MyClassDC(Person person, String name, int count) {
        this.person = person;
        this.name = name;
        this.count = count;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    @Required
    public void setCount(int count) {
        this.count = count;
    }
}