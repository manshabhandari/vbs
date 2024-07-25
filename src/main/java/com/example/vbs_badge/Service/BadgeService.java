package com.example.vbs_badge.Service;

import com.example.vbs_badge.Model.vbs_badge;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BadgeService {
    public vbs_badge create(vbs_badge badge);
    public List<vbs_badge> getAllVisitors();
    public vbs_badge getVisitorById(int id);
    public Optional<vbs_badge> getBadgeById(int id);
    public List<vbs_badge> getAllBadges();

}
