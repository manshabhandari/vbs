package com.example.vbs_badge.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Data
public class vbs_users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String password;
    private String first_name;
    private String last_name;
    private Integer company_id;
    private String serial_number;
}


