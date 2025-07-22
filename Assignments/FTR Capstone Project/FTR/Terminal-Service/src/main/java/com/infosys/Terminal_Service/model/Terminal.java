package com.infosys.Terminal_Service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Terminal {

    @Id
    private String terminalId;

    private String terminalName;

    private String country;

    private String itemType;

    private String terminalDescription;

    private Long capacity;

    private Long availableCapacity;

    private String status;

    private String harborLocation;
}