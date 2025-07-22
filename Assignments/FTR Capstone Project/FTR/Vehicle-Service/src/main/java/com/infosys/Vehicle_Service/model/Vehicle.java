package com.infosys.Vehicle_Service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Vehicle {

    @Id
    private String vehicleNumber;

    private String vehicleName;
    private Long maxLiftingCapacity;
    private LocalDate retireDate;
    private String vehicleStatus;
    private String harborLocation;
    private String country;

}