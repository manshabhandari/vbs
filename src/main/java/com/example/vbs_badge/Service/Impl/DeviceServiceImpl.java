package com.example.vbs_badge.Service.Impl;

import com.example.vbs_badge.Model.vbs_company_devices;
import com.example.vbs_badge.Repository.DeviceRepository;
import com.example.vbs_badge.Service.DeviceService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl implements DeviceService {

    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public vbs_company_devices getDeviceBySerialNumber(String serialNumber) {
        return deviceRepository.findById(serialNumber).orElse(null);
    }

    @Override
    public List<vbs_company_devices> getAllDevices() {
        return deviceRepository.findAll();
    }
}