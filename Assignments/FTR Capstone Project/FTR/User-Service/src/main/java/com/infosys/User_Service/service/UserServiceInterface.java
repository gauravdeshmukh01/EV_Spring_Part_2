package com.infosys.User_Service.service;

import com.infosys.User_Service.model.User;

import java.util.List;

public interface UserServiceInterface {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long userId);

    User updateUser(Long userId, User user);

    void deleteUser(Long userId);

}