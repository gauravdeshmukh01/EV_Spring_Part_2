package com.infosys.WorkItem_Service.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class VehicleDto {
    private String vehicleNumber;
    private String vehicleName;
    private Long maxLiftingCapacity;
    private LocalDate retireDate;
    private String vehicleStatus;
    private String harborLocation;
    private String country;
}