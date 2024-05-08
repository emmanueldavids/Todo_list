package com.example.controller;

import java.util.List;
import java.util.Optional;

// import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Entity.User;
import com.example.Repo.UserRepo;





@RestController
public class UserController {
    @Autowired
    UserRepo repo;
    
    //Get method 2x
    @GetMapping("/api/todo")    
    public List<User> getAllUser(){
        List<User> user = repo.findAll();
        return user;
    }

    //get method by Id
    @GetMapping("/api/{id}")
    public User getUser(@PathVariable int id){
        User user = repo.findById(id).get();
        return user;
    }


    //Post method
    @PostMapping("/api/add")
    public void createUser(@RequestBody User user) {
        //TODO: process POST request
        repo.save(user);
        
        // return entity;
    }
    

    //Update or put method
    @PutMapping("/api/update/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User updateUser) {
        Optional<User> optionalUser = repo.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setTitle(updateUser.getTitle());
            user.setDescription(updateUser.getDescription());

            return repo.save(user);
        }
        return updateUser; // If the user with the given ID doesn't exist, return the updated user object as is.
    }

    //Delete method
    @DeleteMapping("/api/delete/{id}")
    public void removeStudent(@PathVariable int id){
        User user = repo.findById(id).get();
        repo.delete(user);
    }

}
