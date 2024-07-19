package com.example.vbs_badge.Service;

import com.example.vbs_badge.Model.vbs_company;
import org.springframework.stereotype.Service;

@Service
public interface CompanyService {
    vbs_company getCompanyById(Integer id);

    byte[] getLogoById(Integer id);
}
