package com.mtsmda.rest.model.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by MTSMDA on 27.12.2015.
 */
@XmlRootElement(name = "customer")
public class Customer {

    private String customerName;
    private int pin;

    public Customer() {

    }

    public Customer(String customerName, int pin) {
        this.customerName = customerName;
        this.pin = pin;
    }

    @XmlElement
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    @XmlAttribute
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (pin != customer.pin) return false;
        return customerName.equals(customer.customerName);

    }

    @Override
    public int hashCode() {
        int result = customerName.hashCode();
        result = 31 * result + pin;
        return result;
    }
}