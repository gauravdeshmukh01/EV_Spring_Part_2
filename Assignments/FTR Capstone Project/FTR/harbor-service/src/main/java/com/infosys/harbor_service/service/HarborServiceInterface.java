package com.infosys.harbor_service.service;

import com.infosys.harbor_service.model.Harbor;

import java.util.List;

public interface HarborServiceInterface {
    List<Harbor> getAllHarbors();
    Harbor getHarborByCountry(String country);
    Harbor addHarbor(Harbor harbor);
    Harbor updateHarbor(String country, Harbor harbor);
    void deleteHarbor(String country);
}