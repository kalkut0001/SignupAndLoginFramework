package com.ap.signlogin.service;

import com.ap.signlogin.model.User;
import com.ap.signlogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }

    public List<User> getAllUsers(){
        List<User> employees = new ArrayList<User>();
        userRepository.findAll().forEach(User -> employees.add(User));
        return employees;
    }

    public void saveOrUpdate(User User) {
        userRepository.save(User);
    }

    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
}
