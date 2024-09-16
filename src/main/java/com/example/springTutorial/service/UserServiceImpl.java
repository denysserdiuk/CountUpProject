package com.example.springTutorial.service;

import aj.org.objectweb.asm.commons.TryCatchBlockSorter;
import com.example.springTutorial.model.User;
import com.example.springTutorial.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "User +" + user.getUsername() + " created";
    }

    public String updateUser(long id, String name, String username,
                             String email, String password) {
        User user = new User();
        user.setUsername(name);
        user.setName(username);
        user.setEmail(email);
        userRepository.save(user);
        return "User " + username + " updated";
    }

    @Override
    public String deleteUser(long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "User with ID " + id + " deleted";
        } else {
            return "User with ID " + id + " not found";
        }
    }
}
