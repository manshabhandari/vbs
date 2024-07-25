package com.example.vbs_badge.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.vbs_badge.Model.vbs_users;
import com.example.vbs_badge.Service.UserService;

@RestController
@RequestMapping("/vbs")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/viewusers")
    public List<vbs_users> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/viewusers/id/{id}")
    public vbs_users getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("/viewusers/sn/{serialnumber}")
    public vbs_users getUserBySerialNumber(@PathVariable("serialnumber") String serialNumber) {
        return userService.getUserBySerialNumber(serialNumber);
    }
}
