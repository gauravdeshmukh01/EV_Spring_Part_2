package com.infosys.Vehicle_Service.repo;

import com.infosys.Vehicle_Service.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, String> {

}