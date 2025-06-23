package com.example.project.proj.Entity;

import org.springframework.beans.factory.annotation.Autowired;

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
    @Autowired
    private Cart cart;

    public User(){

    }

    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
        this.wallet = 0.0;
        this.cart = new Cart();
    }

    public User(String username, String password, String email, double wallet){
        this.username = username;
        this.password = password;
        this.email = email;
        this.wallet = wallet;
        this.id = 0L;
        this.cart = new Cart();
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
    public Cart getCart(){
        return this.cart;
    }

    @Override
    public String toString(){
        return "User{ userId = " + this.id + ", username = '" + this.username + "', password = '" + this.password + "', email = '" + this.email + "', funds = " + this.wallet + ", cart = " + this.cart.toString() + " }";
    }
}
