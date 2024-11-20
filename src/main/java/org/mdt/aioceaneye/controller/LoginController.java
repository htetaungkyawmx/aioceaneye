package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired private AdminService adminService;
    @Autowired private PilotService pilotService;
    @Autowired private CaptainService captainService;
    @Autowired private GuestService guestService;
    @Autowired private CompanyService companyService;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> requestBody) {
        String email = requestBody.get("email");
        String password = requestBody.get("password");
        String role = requestBody.get("role");

        if (email == null || password == null || role == null) {
            Map<String, String> response = new HashMap<>();
            response.put("message", "Missing required parameters");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        boolean isValidUser = false;
        String roleName = "";

        switch (role.toLowerCase()) {
            case "admin":
                isValidUser = adminService.validateUser(email, password);
                roleName = "Admin";
                break;
            case "pilot":
                isValidUser = pilotService.validateUser(email, password);
                roleName = "Pilot";
                break;
            case "captain":
                isValidUser = captainService.validateUser(email, password);
                roleName = "Captain";
                break;
            case "guest":
                isValidUser = guestService.validateUser(email, password);
                roleName = "Guest";
                break;
            case "company":
                isValidUser = companyService.validateUser(email, password);
                roleName = "Company";
                break;
            default:
                Map<String, String> response = new HashMap<>();
                response.put("message", "Invalid role");
                return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        Map<String, String> response = new HashMap<>();
        if (isValidUser) {
            response.put("message", "Login successful");
            response.put("role", roleName);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.put("message", "Invalid credentials");
            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        }
    }
}
