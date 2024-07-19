package com.example.vbs_badge.Controller;

import com.example.vbs_badge.Model.vbs_company;
import com.example.vbs_badge.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vbs/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    // Endpoint to retrieve a company by ID
    @GetMapping("/{id}")
    public vbs_company getCompanyById(@PathVariable Integer id) {
        return companyService.getCompanyById(id);
    }

    @GetMapping("/{id}/logo")
    public ResponseEntity<byte[]> getLogoById(@PathVariable Integer id) {
        byte[] imageBytes = companyService.getLogoById(id);
        if (imageBytes != null) {
            return ResponseEntity.ok()
                    .contentType(MediaType.IMAGE_JPEG)
                    .body(imageBytes);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Add more endpoints as needed for CRUD operations on vbs_company
}
