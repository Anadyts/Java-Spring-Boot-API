package com.example.CrudAPI.services;

import com.example.CrudAPI.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    User findById(Integer id);
    void deleteById(Integer id);


}
