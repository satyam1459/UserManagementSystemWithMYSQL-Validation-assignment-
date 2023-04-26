package com.geekster.UserManagementSystem.controller;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.getListOfUser();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable int userId){
        return userService.getUser(userId);
    }

    @PostMapping
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping
    public String updateUser(@RequestBody User user){
        return this.userService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable int userId){
        try{
            this.userService.deleteUser(userId);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
