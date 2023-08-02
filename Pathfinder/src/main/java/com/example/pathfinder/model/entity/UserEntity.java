package com.example.pathfinder.model.entity;

import com.example.pathfinder.model.enums.UserLevelEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;


    private Set<RoleEntity> role;

    @Enumerated(EnumType.STRING)
    private UserLevelEnum level;


}
