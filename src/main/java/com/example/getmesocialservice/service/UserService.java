package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.repoistery.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public User getUser() {
        return userRepo.getUser();
    }

    public User saveUser(User user) {       return userRepo.saveUser(user);
    }

    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }

    public User getUserById(int userId) {

        return userRepo.getUserById(userId);

    }

    public User updateUser(int userId, User user) {
        return userRepo.updateUser(userId,user);
    }

    public User deleteUser(int userId) {
        return userRepo.deleteUser(userId);
    }
}
