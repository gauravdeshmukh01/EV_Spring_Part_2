package com.infosys.account_service.repo;

import com.infosys.account_service.model.Account;
import com.infosys.account_service.repo.AccountRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account, String> {

    boolean existsByEmail(String email);

    Account findByNameAndPassword(String name, String password);

}