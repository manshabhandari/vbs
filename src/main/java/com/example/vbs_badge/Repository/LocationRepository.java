package com.example.vbs_badge.Repository;

import com.example.vbs_badge.Model.vbs_locations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<vbs_locations, Integer> {
}
