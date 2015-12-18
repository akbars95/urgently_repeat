package com.mtsmda.springCore.autowiring.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Component(value = "Titov")
public class FootballPlayer {

    @Value(value = "9")
    private Integer id;

    @Value(value = "Titov")
    private String lastname;

    @Value(value = "Egor")
    private String firstname;

    @Value(value = "40")
    private Integer age;

    @Value(value = "9")
    private Integer number;

    public FootballPlayer() {

    }

    public FootballPlayer(String lastname, String firstname, Integer age, Integer number) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", age=" + age +
                ", number=" + number +
                '}';
    }
}