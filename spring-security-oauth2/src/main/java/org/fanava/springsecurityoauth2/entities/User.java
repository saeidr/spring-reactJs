package org.fanava.springsecurityoauth2.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "USERS_SEQ", sequenceName = "USERS_SEQ",allocationSize = 1)
    private int id;
    private String username;
    private String password;
    private String authority;
    private boolean accountNonExpire;
    private boolean accountNonLock;
    private boolean credentialsNonExpired;
    private boolean enabled;
}
