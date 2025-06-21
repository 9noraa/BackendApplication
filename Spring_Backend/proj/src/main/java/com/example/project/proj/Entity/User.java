package com.example.project.proj.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    private @Id
    @GeneratedValue Long id;
    private String username;
    private String password;
    private String email;
    private double wallet;

    User(){

    }

    User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
        this.wallet = 0.0;
    }

    User(String username, String password, String email, double wallet){
        this.username = username;
        this.password = password;
        this.email = email;
        this.wallet = wallet;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void addFunds(double amount){
        this.wallet += amount;
    }

    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getEmail(){
        return this.email;
    }
    public double getFunds(){
        return this.wallet;
    }
    public Long getId(){
        return this.id;
    }
}
