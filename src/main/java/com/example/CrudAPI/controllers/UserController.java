package com.example.CrudAPI.controllers;

import com.example.CrudAPI.entity.User;
import com.example.CrudAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        user.setId(0);
        return  userService.save(user);
    }

    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id){
        User user = userService.findById(id);

        if(user == null){
            throw new RuntimeException("Not Found");
        }
        return  user;
    }

    @DeleteMapping("/users/{id}")
    public  String deleteUser(@PathVariable int id){
        User user = userService.findById(id);
        if(user == null ){
            throw new RuntimeException("Not found");
        }

        userService.deleteById(id);
        return "Delete" + id;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        return userService.save(user);
    }
}
