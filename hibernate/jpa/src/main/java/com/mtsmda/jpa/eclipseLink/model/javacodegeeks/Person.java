package com.mtsmda.jpa.eclipseLink.model.javacodegeeks;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by c-DMITMINZ on 30.12.2015.
 */
@Entity
@Table
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "person")
    @JoinColumn(name = "id_card_id")
    private IdCard idCard;
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person", cascade = CascadeType.ALL)
    private List<Phone> phones = new ArrayList<Phone>();

    public Person() {

    }

    public Person(IdCard idCard, String name) {
        this.idCard = idCard;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}