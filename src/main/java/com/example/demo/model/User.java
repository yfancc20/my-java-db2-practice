package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String account;
    private String password;
    private String name;
    private String email;

    protected User() {}

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("Users[account=%s], password='%s'", account, password);
    }

    public Long getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }
}