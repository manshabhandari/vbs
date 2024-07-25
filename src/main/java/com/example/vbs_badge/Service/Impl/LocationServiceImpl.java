package com.example.vbs_badge.Service.Impl;
import com.example.vbs_badge.Service.LocationService;
import com.example.vbs_badge.Model.vbs_locations;
import com.example.vbs_badge.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepository locationRepository;

    @Override
    public List<vbs_locations> getAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public vbs_locations getLocationById(int id) {
        return locationRepository.findById(id).get();
    }

}
