package com.example.vbs_badge.Repository;

import com.example.vbs_badge.Model.vbs_badge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BadgeRepository extends JpaRepository<vbs_badge, Integer> {
}
