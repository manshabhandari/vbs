package com.example.vbs_badge.Controller;

import com.example.vbs_badge.Model.vbs_badge;
import com.example.vbs_badge.Service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vbs")
public class BadgeController {

    @Autowired
    private BadgeService badgeService;

    @GetMapping("/display")
    public ResponseEntity<byte[]> displayImage(@RequestParam("id") int id) throws IOException, SQLException {
        Optional<vbs_badge> optionalBadge = badgeService.getBadgeById(id);
        if (optionalBadge.isPresent()) {
            vbs_badge badge = optionalBadge.get();
            if (badge.getPhoto() != null) {
                Blob blob = badge.getPhoto();
                byte[] imageBytes = blob.getBytes(1, (int) blob.length());
                return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping({"", "/"})
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("index");
        List<vbs_badge> badgeList = badgeService.getAllBadges();
        mv.addObject("badgeList", badgeList);
        return mv;
    }

    @GetMapping("/viewvisitors")
    public List<vbs_badge> getVisitors() {
        return badgeService.getAllVisitors();
    }

    @GetMapping("/viewvisitors/{id}")
    public vbs_badge getVisitor(@PathVariable Integer id) {
        return badgeService.getVisitorById(id);
    }

@PostMapping("/addvisitor")
public ResponseEntity<String> uploadBadge(
        @RequestParam("photo") MultipartFile file,
        @RequestParam("first_name") String first_name,
        @RequestParam("last_name") String last_name,
        @RequestParam("visiting_whom") String visiting_whom,
        @RequestParam("purpose") String purpose,
        @RequestParam("date_of_birth") String date_of_birth,
        @RequestParam("height") String height,
        @RequestParam("gender") String gender,
        @RequestParam("id_photo") MultipartFile id_photo,
        @RequestParam("id_number") String id_number,
        @RequestParam("issue_date") String issue_date,
        @RequestParam("expiry_date") String expiry_date,
        @RequestParam("state") String state,
        @RequestParam("country") String country,
        @RequestParam("address") String address,
        @RequestParam("company_id") Integer company_id,
        @RequestParam("location_id") Integer location_id,
        @RequestParam("badge_expiry") String badge_expiry,
        @RequestParam("created_by") Integer created_by,
        @RequestParam("updated_by") Integer updated_by,
        @RequestParam("date_created") String date_created,
        @RequestParam("date_updated") String date_updated
) {
    try {
        if (!file.isEmpty()) {
            byte[] bytes = file.getBytes();
            Blob blob = new SerialBlob(bytes);

            vbs_badge badge = new vbs_badge();
            badge.setPhoto(blob);
            badge.setFirst_name(first_name);
            badge.setLast_name(last_name);
            badge.setVisiting_whom(visiting_whom);
            badge.setPurpose(purpose);
            badge.setDate_of_birth(date_of_birth);
            badge.setHeight(height);
            badge.setGender(gender);
            badge.setId_photo(blob);
            badge.setIssue_date(issue_date);
            badge.setExpiry_date(expiry_date);
            badge.setState(state); 
            badge.setCountry(country);
            badge.setAddress(address);
            badge.setCompany_id(company_id);
            badge.setLocation_id(location_id);
            badge.setBadge_expiry(badge_expiry);
            badge.setCreated_by(created_by);
            badge.setUpdated_by(updated_by);
            badge.setDate_created(date_created);
            badge.setDate_updated(date_updated);

            // Debugging logs
            System.out.println("Received fields:");
            System.out.println("first_name: " + first_name);
            System.out.println("last_name: " + last_name);
            System.out.println("visiting_whom: " + visiting_whom);
            System.out.println("purpose: " + purpose);
            System.out.println("date_of_birth: " + date_of_birth);
            System.out.println("height: " + height);
            System.out.println("gender: " + gender);
            System.out.println("id_number: " + id_number);
            System.out.println("issue_date: " + issue_date);
            System.out.println("expiry_date: " + expiry_date);
            System.out.println("state: " + state);
            System.out.println("country: " + country);
            System.out.println("address: " + address);
            System.out.println("company_id: " + company_id);
            System.out.println("location_id: " + location_id);
            System.out.println("badge_expiry: " + badge_expiry);
            System.out.println("created_by: " + created_by);
            System.out.println("updated_by: " + updated_by);
            System.out.println("date_created: " + date_created);
            System.out.println("date_updated: " + date_updated);

            badgeService.create(badge);
            return ResponseEntity.ok("Badge and data uploaded successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No image provided");
        }
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while uploading: " + e.getMessage());
    }
}
}