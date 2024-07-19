package com.example.vbs_badge.Controller;

import com.example.vbs_badge.Model.vbs_badge;
import com.example.vbs_badge.Service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vbs")
public class BadgeController {

    @Autowired
    private BadgeService badgeService;


    @GetMapping("/viewvisitors")
    public List<vbs_badge> getVisitors() {
        return badgeService.getAllVisitors();
    }

    @GetMapping("/viewvisitors/{id}")
    public vbs_badge getVisitor(@PathVariable Integer id) {
        return badgeService.getVisitorById(id);
    }

    @PostMapping("/addvisitor")
    public vbs_badge saveVisitor(@RequestBody vbs_badge badge) {
        return badgeService.create(badge);
    }
}
