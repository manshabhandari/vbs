package com.example.vbs_badge.Repository;

import com.example.vbs_badge.Model.vbs_company_devices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<vbs_company_devices, String> {

}
