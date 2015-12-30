package com.mtsmda.jpa.eclipseLink.model.javacodegeeks;

import javax.persistence.*;

/**
 * Created by c-DMITMINZ on 30.12.2015.
 */
@Entity
@Table
public class Phone {

    @Id
    @GeneratedValue
    private Long id;
    private String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;

    public Phone() {

    }

    public Phone(String number, Person person) {
        this.number = number;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}