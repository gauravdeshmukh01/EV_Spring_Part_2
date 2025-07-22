package com.infosys.Vehicle_Service.controller;

import com.infosys.Vehicle_Service.model.Vehicle;
import com.infosys.Vehicle_Service.service.VehicleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleServiceInterface vehicleService;

    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.saveVehicle(vehicle);
    }

    @GetMapping("/{vehicleNumber}")
    public Vehicle getVehicle(@PathVariable String vehicleNumber) {
        return vehicleService.getVehicleById(vehicleNumber);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @DeleteMapping("/{vehicleNumber}")
    public String deleteVehicle(@PathVariable String vehicleNumber) {
        vehicleService.deleteVehicleById(vehicleNumber);
        return "Vehicle deleted successfully";
    }

    @PutMapping
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.updateVehicle(vehicle);
    }
}