package com.greatLearning.employeeMS.entity;


import lombok.*;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="roles")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int roleId;

    private String name;


    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name="role_id"),
            inverseJoinColumns = @JoinColumn(name="user_id")
    )
    @JsonIgnore
    private Set<User> users;

    public Set<User> getUsers(){
        if (this.users == null){
            this.users = new HashSet<>();
        }
        return this.users;
    }
}
