package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.User;


public interface UserRepo extends JpaRepository<User, Integer>{

}
