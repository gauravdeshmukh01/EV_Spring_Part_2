package com.infosys.WorkItem_Service.repo;

import com.infosys.WorkItem_Service.model.WorkItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkItemRepo extends JpaRepository<WorkItem, String> {
}
