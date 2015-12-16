package com.mtsmda.javaXML.jaxb;

import javax.xml.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by c-DMITMINZ on 15.12.2015.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

    @XmlElementWrapper(name = "email-addresses")
    @XmlElement(name = "email-address")
    private List<String> emailAddress;

    @XmlList
    private List<Integer> countEmails;

    private Map<String, Integer> priceList = new HashMap<String, Integer>();

    @XmlAttribute
    private Integer number;

    public Customer() {
    }

    public Customer(List<String> emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<String> getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(List<String> emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<Integer> getCountEmails() {
        return countEmails;
    }

    public void setCountEmails(List<Integer> countEmails) {
        this.countEmails = countEmails;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Map<String, Integer> getPriceList() {
        return priceList;
    }

    public void setPriceList(Map<String, Integer> priceList) {
        this.priceList = priceList;
    }
}