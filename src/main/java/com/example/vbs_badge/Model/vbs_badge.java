package com.example.vbs_badge.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Getter
@Setter
@Data
public class vbs_badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String first_name;
    private String middle_name;
    private String last_name;
    private String visiting_whom;
    private String purpose;
    private String date_of_birth;
    private String height;
    private String gender;
    private String id_number;
    private String issue_date;
    private String expiry_date;
    private String state;
    private String country;
    private String address;
    private Integer company_id;
    private Integer location_id;
    private String badge_expiry;
}
