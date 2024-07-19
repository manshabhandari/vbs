package com.example.vbs_badge.Controller;// VbsCompanyDevicesController.java

import com.example.vbs_badge.Model.vbs_company_devices;
import com.example.vbs_badge.Service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vbs/devices")
public class DeviceController {

    private final DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/{serialNumber}")
    public ResponseEntity<?> getDeviceBySerialNumber(@PathVariable String serialNumber) {
        vbs_company_devices device = deviceService.getDeviceBySerialNumber(serialNumber);
        if (device == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(device);
    }

    // Add more endpoints as needed
}
