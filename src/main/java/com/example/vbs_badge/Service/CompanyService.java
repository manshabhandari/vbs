package com.example.vbs_badge.Service;

import com.example.vbs_badge.Model.vbs_company;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CompanyService {
    vbs_company getCompanyById(Integer id);
    List<vbs_company> getAllCompanies();
    byte[] getLogoById(Integer id);
}
