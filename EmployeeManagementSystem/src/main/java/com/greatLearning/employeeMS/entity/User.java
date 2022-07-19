package com.greatLearning.employeeMS.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name="users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    private String userName;

    private String password;

    @ManyToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Role> roles;

    public void addRole(Role role){
        if(this.roles == null){
            this.roles = new HashSet<>();
        }
        //set the bidirectional mapping
        this.roles.add(role);
        role.getUsers().add(this);
    }
}
