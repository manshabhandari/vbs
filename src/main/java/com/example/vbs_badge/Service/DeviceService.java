package com.example.vbs_badge.Service;


import com.example.vbs_badge.Model.vbs_company_devices;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface DeviceService {

    vbs_company_devices getDeviceBySerialNumber(String serialNumber);
    List<vbs_company_devices> getAllDevices();

}
