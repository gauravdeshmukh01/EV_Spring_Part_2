package com.infosys.account_service.services;

import com.infosys.account_service.model.Account;

public interface AccountServiceInterface {

    String register(Account account);

    String login(String name, String password);

}
