package com.infosys.harbor_service.service;

import com.infosys.harbor_service.model.Harbor;
import com.infosys.harbor_service.repo.HarborRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HarborService implements HarborServiceInterface {

    @Autowired
    private HarborRepo harborRepo;

    @Override
    public List<Harbor> getAllHarbors() {
        return harborRepo.findAll();
    }

    @Override
    public Harbor getHarborByCountry(String country) {
        return harborRepo.findById(country).orElse(null);
    }

    @Override
    public Harbor addHarbor(Harbor harbor) {
        return harborRepo.save(harbor);
    }

    @Override
    public Harbor updateHarbor(String country, Harbor harbor) {
        Harbor existing = harborRepo.findById(country).orElse(null);
        if (existing != null) {
            existing.setAvailableHarborLocations(harbor.getAvailableHarborLocations());
            return harborRepo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteHarbor(String country) {
        harborRepo.deleteById(country);
    }
}