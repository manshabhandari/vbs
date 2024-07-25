package com.example.vbs_badge.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.vbs_badge.Model.vbs_locations;


@Service
public interface LocationService {
     public List<vbs_locations> getAllLocations();
     public vbs_locations getLocationById(int id);

}
