package com.infosys.WorkItem_Service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class WorkItem {

    @Id
    private String workitemId;
    private Long userId;
    private String itemName;
    private String itemType;
    private String itemDescription;
    private String messageToRecipient;
    private String quantity;
    private String sourceCountry;
    private String destinationCountry;
    private String selectedHarborLocation;
    private Date shippingDate;
    private Long amount;
}