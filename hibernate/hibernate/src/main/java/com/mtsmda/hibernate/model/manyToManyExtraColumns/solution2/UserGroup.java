package com.mtsmda.hibernate.model.manyToManyExtraColumns.solution2;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
@Entity
@Table(name = "users_groups")
public class UserGroup {

    @Id
    @GeneratedValue
    @Column(name = "USER_GROUP_ID")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    private Group group;

    private Boolean activated;

    @Temporal(TemporalType.DATE)
    @Column(name = "registered_date")
    private Date registredDate;

    public UserGroup() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Boolean isActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public Date getRegistredDate() {
        return registredDate;
    }

    public void setRegistredDate(Date registredDate) {
        this.registredDate = registredDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserGroup userGroup = (UserGroup) o;

        if (id != null ? !id.equals(userGroup.id) : userGroup.id != null) return false;
        if (!user.equals(userGroup.user)) return false;
        if (!group.equals(userGroup.group)) return false;
        if (!activated.equals(userGroup.activated)) return false;
        return registredDate.equals(userGroup.registredDate);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + user.hashCode();
        result = 31 * result + group.hashCode();
        result = 31 * result + activated.hashCode();
        result = 31 * result + registredDate.hashCode();
        return result;
    }
}