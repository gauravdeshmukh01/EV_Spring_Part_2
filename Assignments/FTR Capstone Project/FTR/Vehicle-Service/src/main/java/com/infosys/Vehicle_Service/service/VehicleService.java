package com.infosys.Vehicle_Service.service;

import com.infosys.Vehicle_Service.model.Vehicle;
import com.infosys.Vehicle_Service.repo.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements VehicleServiceInterface {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }

    @Override
    public Vehicle getVehicleById(String vehicleNumber) {
        return vehicleRepo.findById(vehicleNumber).orElseThrow(() -> new RuntimeException("Vehicle not found"));
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepo.findAll();
    }

    @Override
    public void deleteVehicleById(String vehicleNumber) {
        vehicleRepo.deleteById(vehicleNumber);
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }
}