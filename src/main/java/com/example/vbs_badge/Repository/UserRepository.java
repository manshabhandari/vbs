package com.example.vbs_badge.Repository;

import com.example.vbs_badge.Model.vbs_users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<vbs_users, Integer> {
    @Query("SELECT u FROM vbs_users u WHERE u.serial_number = :serialNumber")
    vbs_users findBySerialNumber(@Param("serialNumber") String serialNumber);
}
