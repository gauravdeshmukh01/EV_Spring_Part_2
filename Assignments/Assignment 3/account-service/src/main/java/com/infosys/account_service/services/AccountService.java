package com.infosys.account_service.services;

import com.infosys.account_service.model.Account;
import com.infosys.account_service.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements AccountServiceInterface {

    @Autowired
    private AccountRepo accountRepository;

    @Override
    public String register(Account account) {
        try {
            // Validate input
            if (account.getName().isBlank() || account.getEmail().isBlank() ||
                    account.getPassword().isBlank() || account.getConfirmPassword().isBlank()) {
                return "All fields are mandatory.";
            }

            if (accountRepository.existsByEmail(account.getEmail())) {
                return "Email already used.";
            }

            if (!account.getName().matches("^[a-zA-Z0-9]*$")) {
                return "Name contains invalid characters. Only alphanumeric allowed.";
            }

            if (!isValidPassword(account.getPassword())) {
                return "Password must contain at least 1 uppercase, 1 lowercase, 1 number, and 1 special character.";
            }

            if (!account.getPassword().equals(account.getConfirmPassword())) {
                return "Password and Confirm Password do not match.";
            }

            // Save to DB
            accountRepository.save(account);
            return "Registered successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Registration error: " + e.getMessage();
        }

    }

    @Override
    public String login(String name, String password) {
        try {
            // Validate input
            if (name.isBlank() || password.isBlank()) {
                return "All fields are mandatory.";
            }

            // Find by name & password
            Account account = accountRepository.findByNameAndPassword(name, password);
            if (account == null) {
                return "Invalid credentials.";
            }

            return "Login successful!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Something went wrong during login. Please try again.";
        }
    }

    // Password must have:
    // - at least 1 uppercase
    // - at least 1 lowercase
    // - at least 1 number
    // - at least 1 special character
    // - minimum 6 characters
    private boolean isValidPassword(String password) {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{6,}$");
    }
}
