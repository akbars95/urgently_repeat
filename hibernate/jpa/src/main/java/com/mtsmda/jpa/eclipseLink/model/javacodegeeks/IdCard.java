package com.mtsmda.jpa.eclipseLink.model.javacodegeeks;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by c-DMITMINZ on 30.12.2015.
 */
@Entity
@Table
public class IdCard {

    @Id
    @GeneratedValue
    private Long id;
    private String idNumber;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Person person;

    @Temporal(TemporalType.TIMESTAMP)
    private Date issueDate;

    public IdCard() {

    }

    public IdCard(String idNumber, Date issueDate) {
        this.idNumber = idNumber;
        this.issueDate = issueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "id=" + id +
                ", idNumber='" + idNumber + '\'' +
                ", person=" + person +
                ", issueDate=" + issueDate +
                '}';
    }
}