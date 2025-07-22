package com.infosys.harbor_service.repo;

import com.infosys.harbor_service.model.Harbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HarborRepo extends JpaRepository<Harbor, String> {
}