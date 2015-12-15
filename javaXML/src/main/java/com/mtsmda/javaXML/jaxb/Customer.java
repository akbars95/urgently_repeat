package com.mtsmda.javaXML.jaxb;

import javax.xml.bind.annotation.*;
import java.util.List;

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
}