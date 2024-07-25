package com.example.vbs_badge.Controller;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.example.vbs_badge.Model.vbs_locations;
import com.example.vbs_badge.Service.LocationService;

@RestController
@RequestMapping("/vbs")
public class LocationController {

    private LocationService locationService;

    @GetMapping("/viewlocations")
    public List<vbs_locations> getLocations() {
        return locationService.getAllLocations();
    }

    @GetMapping("/viewlocations/{id}")
    public vbs_locations getLocationById(@PathVariable Integer id) {
        return locationService.getLocationById(id);
    }
}
