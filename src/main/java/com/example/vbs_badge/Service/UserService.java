package com.example.vbs_badge.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.vbs_badge.Model.vbs_users;


@Service
public interface UserService {
     public List<vbs_users> getAllUsers();
     public vbs_users getUserById(int id);
     public vbs_users getUserBySerialNumber(String serial_number);



}
