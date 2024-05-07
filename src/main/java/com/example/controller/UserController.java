package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Entity.User;
import com.example.Repo.UserRepo;



@RestController
public class UserController {
    @Autowired
    UserRepo repo;
    
    //Get method 2x
    @GetMapping("/api/users")    
    public List<User> getAllUser(){
        List<User> user = repo.findAll();
        return user;
    }

    //get method by Id
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        User user = repo.findById(id).get();
        return user;

    }
    //Post method
    //Update or put method
    //Delete method


}
