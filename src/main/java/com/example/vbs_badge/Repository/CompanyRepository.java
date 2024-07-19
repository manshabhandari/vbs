package com.example.vbs_badge.Repository;

import com.example.vbs_badge.Model.vbs_company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<vbs_company, Integer> {
    // This interface inherits CRUD methods from JpaRepository
    // You can add custom query methods here if needed
}
