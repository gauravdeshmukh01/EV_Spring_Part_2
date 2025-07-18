package com.infosys.account_service.controller;

import com.infosys.account_service.repo.AccountRepo;
import com.infosys.account_service.model.Account;
import com.infosys.account_service.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public String register(@RequestBody Account account) {
        return accountService.register(account);
    }

    @PostMapping("/login")
    public String login(@RequestParam String name, @RequestParam String password) {
        return accountService.login(name, password);
    }

}
