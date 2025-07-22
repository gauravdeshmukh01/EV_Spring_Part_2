package com.infosys.WorkItem_Service.service;

import com.infosys.WorkItem_Service.model.WorkItem;
import com.infosys.WorkItem_Service.repo.WorkItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkItemService implements WorkItemServiceInterface {

    @Autowired
    private WorkItemRepo workItemRepository;

    @Override
    public WorkItem createWorkItem(WorkItem workItem) {
        return workItemRepository.save(workItem);
    }

    @Override
    public List<WorkItem> getAllWorkItems() {
        return workItemRepository.findAll();
    }

    @Override
    public WorkItem getWorkItemById(String id) {
        return workItemRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteWorkItem(String id) {
        workItemRepository.deleteById(id);
    }
}