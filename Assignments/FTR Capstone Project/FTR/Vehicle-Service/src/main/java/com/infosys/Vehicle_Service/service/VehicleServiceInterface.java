package com.infosys.Vehicle_Service.service;

import com.infosys.Vehicle_Service.model.Vehicle;

import java.util.List;

public interface VehicleServiceInterface {
    Vehicle saveVehicle(Vehicle vehicle);
    Vehicle getVehicleById(String vehicleNumber);
    List<Vehicle> getAllVehicles();
    void deleteVehicleById(String vehicleNumber);
    Vehicle updateVehicle(Vehicle vehicle);
}
