package com.mtsmda.hibernate.model.manyToManyExtraColumns.solution2;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
@Entity
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue
    @Column(name = "GROUP_ID")
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "")
    private Set<UserGroup> userGroups = new HashSet<UserGroup>();

    public Group() {

    }

    public Group(String name, Set<UserGroup> userGroups) {
        this.name = name;
        this.userGroups = userGroups;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserGroup> getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(Set<UserGroup> userGroups) {
        this.userGroups = userGroups;
    }
}
