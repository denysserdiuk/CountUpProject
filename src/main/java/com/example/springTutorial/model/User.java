package com.example.springTutorial.model;

import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String username;
    private String email;
    private String password;

    public User() {}

    public User(String username, String password) {
        this.username = username;
    }

    public User(final long id, final String name, final String username,
                final String email, final String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    public long getId() {
        return id;
    }
    public void setId(final int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(final String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(final String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(final String password) {
        this.password = password;
    }

    public String toString() {
        return "User [id=" + id + ", name=" + name + "," +
                " username=" + username + ", email=" + email;

    }
}
