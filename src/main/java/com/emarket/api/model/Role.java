package com.emarket.api.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        //noinspection EqualsReplaceableByObjectsCall
        return id != null ? id.equals(role.id) : role.id == null;
    }

    @Override
    public int hashCode() {
        return 31;
    }

}
