package com.mtsmda.hibernate.model.manyToManyExtraColumns.solution2;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
@Entity
@Table(name = "users")
public class User implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;
    private String username;
    private String password;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "")
    private Set<UserGroup> userGroups = new HashSet<UserGroup>();

    public User() {

    }

    public User(String username, String password, String email, Set<UserGroup> userGroups) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.userGroups = userGroups;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<UserGroup> getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(Set<UserGroup> userGroups) {
        this.userGroups = userGroups;
    }
}