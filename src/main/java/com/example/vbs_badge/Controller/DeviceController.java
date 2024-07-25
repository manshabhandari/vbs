package com.example.vbs_badge.Controller;
import com.example.vbs_badge.Model.vbs_company_devices;
import com.example.vbs_badge.Service.DeviceService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vbs")
public class DeviceController {

    private final DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/viewdevices")
    public List<vbs_company_devices> getAllDevices() {
        return deviceService.getAllDevices();
    }

    @GetMapping("devices/{serialNumber}")
    public ResponseEntity<?> getDeviceBySerialNumber(@PathVariable String serialNumber) {
        vbs_company_devices device = deviceService.getDeviceBySerialNumber(serialNumber);
        if (device == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(device);
    }
}
