package com.example.springTutorial.controller;

import com.example.springTutorial.model.User;
import com.example.springTutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUser")
    public String setupUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }

    @PutMapping("/updateUser/{id}")
    public String updateUser(@PathVariable Integer id, @RequestParam String name,
                             @RequestParam String username,
                             @RequestParam String email,
                             @RequestParam String password){
        return userService.updateUser(id, name, username, email, password);
    }
}
