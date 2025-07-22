package com.infosys.WorkItem_Service.FeignClient;

import com.infosys.WorkItem_Service.DTO.VehicleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "VEHICLE-SERVICE")
public interface VehicleClient {
    @GetMapping("/vehicles/{vehicleNumber}")
    VehicleDto getVehicleByNumber(@PathVariable String vehicleNumber);
}