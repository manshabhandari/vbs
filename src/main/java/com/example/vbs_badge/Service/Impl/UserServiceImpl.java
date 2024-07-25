package com.example.vbs_badge.Service.Impl;

import com.example.vbs_badge.Model.vbs_company_devices;
import com.example.vbs_badge.Model.vbs_users;
import com.example.vbs_badge.Repository.UserRepository;
import com.example.vbs_badge.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public List<vbs_users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public vbs_users getUserById(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public vbs_users getUserBySerialNumber(String serialNumber) {
        return userRepository.findBySerialNumber(serialNumber);
    }

}
