package com.example.CrudAPI.services;

import com.example.CrudAPI.entity.User;
import com.example.CrudAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceAction implements UserService{
    private UserRepository userRepository;

    @Autowired
    public UserServiceAction(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user){
        return  userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        Optional<User> result = userRepository.findById(id);

        if(result.isPresent()){
            return result.get();
        }else{
            throw new RuntimeException("Not Found");
        }
    }

    @Override
    public void deleteById(Integer id) {
         userRepository.deleteById(id);
    }


}
