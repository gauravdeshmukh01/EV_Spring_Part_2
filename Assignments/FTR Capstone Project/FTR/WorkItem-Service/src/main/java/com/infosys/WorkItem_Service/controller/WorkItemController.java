package com.infosys.WorkItem_Service.controller;

import com.infosys.WorkItem_Service.DTO.VehicleDto;
import com.infosys.WorkItem_Service.FeignClient.VehicleClient;
import com.infosys.WorkItem_Service.model.WorkItem;
import com.infosys.WorkItem_Service.service.WorkItemServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workitems")
public class WorkItemController {

    @Autowired
    private WorkItemServiceInterface workItemService;

    @Autowired
    private VehicleClient vehicleClient;

    @PostMapping
    public WorkItem create(@RequestBody WorkItem workItem) {
        return workItemService.createWorkItem(workItem);
    }

    @GetMapping
    public List<WorkItem> getAll() {
        return workItemService.getAllWorkItems();
    }

    @GetMapping("/{id}")
    public WorkItem getById(@PathVariable String id) {
        return workItemService.getWorkItemById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        workItemService.deleteWorkItem(id);
    }


    @GetMapping("/vehicle/{vehicleNumber}")
    public VehicleDto getVehicle(@PathVariable String vehicleNumber) {
        return vehicleClient.getVehicleByNumber(vehicleNumber);
    }
}