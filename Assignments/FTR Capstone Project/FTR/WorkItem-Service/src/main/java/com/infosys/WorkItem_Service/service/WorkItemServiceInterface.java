package com.infosys.WorkItem_Service.service;

import com.infosys.WorkItem_Service.model.WorkItem;

import java.util.List;

public interface WorkItemServiceInterface {
    WorkItem createWorkItem(WorkItem workItem);
    List<WorkItem> getAllWorkItems();
    WorkItem getWorkItemById(String id);
    void deleteWorkItem(String id);
}