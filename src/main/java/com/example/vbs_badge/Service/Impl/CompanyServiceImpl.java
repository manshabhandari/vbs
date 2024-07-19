package com.example.vbs_badge.Service.Impl;

import com.example.vbs_badge.Model.vbs_company;
import com.example.vbs_badge.Repository.CompanyRepository;
import com.example.vbs_badge.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public vbs_company getCompanyById(Integer id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public byte[] getLogoById(Integer id) {
        vbs_company company = companyRepository.findById(id).orElse(null);
        if (company != null && company.getLogo() != null) {
            return company.getLogo();
        }
        return null;
    }

    // Implement more methods as needed
}
