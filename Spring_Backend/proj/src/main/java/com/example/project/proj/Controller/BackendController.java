package com.example.project.proj.Controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
public class BackendController {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }
}
