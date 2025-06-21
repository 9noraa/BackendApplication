package com.example.project.proj.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cart {
    private @Id 
    @GeneratedValue Long id;
    private Integer userId;
    private List<Item> items;
    private double price;

    Cart(){

    }

    Cart(List<Item> items, double price, Integer userId){
        this.items = items;
        this.price = price;
        this.userId = userId;
    }

    public void setCartList(List<Item> items){
        this.items = items;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void emptyCart(){
        for(Item item : this.items)
            this.items.remove(item);
    }
    //public void removeItem(Item item){}
    public void calculateTotal(){
        double total = 0.0;
        for(Item items : this.items)
            total += items.getPrice();
        this.price = total;
    }

    public double getPrice(){
        this.calculateTotal();
        return this.price;
    }
    public List<Item> getItems(){
        return this.items;
    }
    public Integer getUser(){
        return this.userId;
    }
}
