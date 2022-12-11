package com.example.RentABook.user;

import jakarta.persistence.*;

@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(
            name="user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private String password;
    private Boolean is_admin;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String name, String email, String password, Boolean is_admin) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.is_admin = is_admin;
    }

    public User(String name, String email, String password, Boolean is_admin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.is_admin = is_admin;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Boolean is_admin) {
        this.is_admin = is_admin;
    }
}
