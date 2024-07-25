package com.example.vbs_badge.Service.Impl;

import com.example.vbs_badge.Model.vbs_badge;
import com.example.vbs_badge.Repository.BadgeRepository;
import com.example.vbs_badge.Service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BadgeServiceImpl implements BadgeService {

    @Autowired
    BadgeRepository badgeRepository;


    @Override
    public vbs_badge create(vbs_badge badge) {
        return badgeRepository.save(badge);
    }

    @Override
    public List<vbs_badge> getAllVisitors() {
        return badgeRepository.findAll();
    }

    @Override
    public vbs_badge getVisitorById(int id) {
        return badgeRepository.findById(id).get();
    }

    @Override
    public Optional<vbs_badge> getBadgeById(int id) {
        return badgeRepository.findById(id);
    }

    @Override
    public List<vbs_badge> getAllBadges() {
        return (List<vbs_badge>) badgeRepository.findAll();
    }

}
