package com.example.springTutorial.service;

import com.example.springTutorial.model.User;

public interface UserService {
    public String createUser(User user);
    public String updateUser(long id, String name, String username, String email, String password);
    public String deleteUser(long id);
}
