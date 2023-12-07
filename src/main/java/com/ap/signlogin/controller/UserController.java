package com.ap.signlogin.controller;

import com.ap.signlogin.model.User;
import com.ap.signlogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path = "/myapp")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/User/{id}")
    public User getUser(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/User/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        userService.deleteUserById(id);
    }

    @PostMapping("/User")
    public void addUser(@RequestBody User User) {
        userService.saveOrUpdate(User);
    }

    @PutMapping("/User")
    public void updateUser(@RequestBody User User) {
        userService.saveOrUpdate(User);
    }


}
