package com.infosys.User_Service.service;
import com.infosys.User_Service.model.User;
import com.infosys.User_Service.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        return userRepo.findById(userId).orElse(null);
    }

    @Override
    public User updateUser(Long userId, User user) {
        User existing = userRepo.findById(userId).orElse(null);
        if (existing != null) {
            existing.setFirstName(user.getFirstName());
            existing.setLastName(user.getLastName());
            existing.setEmailId(user.getEmailId());
            existing.setMobileNumber(user.getMobileNumber());
            existing.setPassword(user.getPassword());
            existing.setNationality(user.getNationality());
            existing.setPassportNumber(user.getPassportNumber());
            existing.setPermanentAddress(user.getPermanentAddress());
            existing.setOfficeAddress(user.getOfficeAddress());
            existing.setPersonalIdentificationNumber(user.getPersonalIdentificationNumber());
            return userRepo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepo.deleteById(userId);
    }
}