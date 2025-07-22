package com.infosys.harbor_service.controller;

import com.infosys.harbor_service.model.Harbor;
import com.infosys.harbor_service.service.HarborServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/harbors")
public class HarborController {

    @Autowired
    private HarborServiceInterface harborService;

    @GetMapping
    public List<Harbor> getAllHarbors() {
        return harborService.getAllHarbors();
    }

    @GetMapping("/{country}")
    public Harbor getHarborByCountry(@PathVariable String country) {
        return harborService.getHarborByCountry(country);
    }

    @PostMapping
    public Harbor addHarbor(@RequestBody Harbor harbor) {
        return harborService.addHarbor(harbor);
    }

    @PutMapping("/{country}")
    public Harbor updateHarbor(@PathVariable String country, @RequestBody Harbor harbor) {
        return harborService.updateHarbor(country, harbor);
    }

    @DeleteMapping("/{country}")
    public void deleteHarbor(@PathVariable String country) {
        harborService.deleteHarbor(country);
    }
}