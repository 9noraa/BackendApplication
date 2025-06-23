package com.example.project.proj.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.proj.Entity.Item;
import com.example.project.proj.Entity.User;

@RestController
public class BackendController {
    @GetMapping("/")
    public String helloWorld(){
        User user = new User("user", "pass123", "testemail@yahoo.com", 100.0 );
        Item item = new Item("itemName", 10, 100.0);
        user.getCart().addItem(item);
        return user.toString();
    }
    

    @PostMapping("/")
    public ResponseEntity<User> postAccount(@RequestBody User requestbody){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
