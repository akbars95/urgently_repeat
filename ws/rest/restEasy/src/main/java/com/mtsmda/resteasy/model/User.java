package com.mtsmda.resteasy.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by MTSMDA on 02.01.2016.
 */
@XmlRootElement(name = "user")
public class User {

    private String username;
    private String password;
    private int pin;

    public User() {

    }

    public User(String username, String password, int pin) {
        this.username = username;
        this.password = password;
        this.pin = pin;
    }

    @XmlElement
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @XmlElement
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlAttribute
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", pin=" + pin +
                '}';
    }
}