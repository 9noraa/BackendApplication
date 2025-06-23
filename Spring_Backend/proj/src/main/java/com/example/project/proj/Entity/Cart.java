package com.example.project.proj.Entity;

import java.util.ArrayList;
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

    public Cart(){
        this.userId = 0;
        this.price = 0.0;
        this.items = new ArrayList<>();
    }

    public Cart(List<Item> items, double price, Integer userId){
        this.items = items;
        this.price = price;
        this.userId = userId;
        this.id = 0L;
        this.items = new ArrayList<>();
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
        if(!this.items.isEmpty()){
            for(Item item : this.items)
                total += item.getPrice();
        }
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
    public Long getId(){
        return this.id;
    }

    @Override
    public String toString(){
        String str = "{ ";
        if(!this.items.isEmpty()){
            for(Item item : this.items){
                str = str.concat(item.getName());
                //fix later
                str = str.concat(", ");
            }
        }
        str = str.concat("}");
        return str;
    }
}
