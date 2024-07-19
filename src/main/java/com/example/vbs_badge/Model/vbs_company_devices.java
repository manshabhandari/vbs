package com.example.vbs_badge.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
// Import LocalTime from java.time

@Entity
@Getter
@Setter
@Data
public class vbs_company_devices {

    @Id
    private String serial_number;

    private Integer company_id;

    private Integer location_id;

    private String badge_expiry;
}
