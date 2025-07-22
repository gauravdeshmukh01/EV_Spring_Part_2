package com.infosys.Terminal_Service.repo;

import com.infosys.Terminal_Service.model.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalRepo extends JpaRepository<Terminal, String> {

}