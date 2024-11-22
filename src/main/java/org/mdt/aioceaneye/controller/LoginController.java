package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
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

        if (email == null || password == null) {
            return ResponseEntity.badRequest().body(Map.of("message", "Missing required parameters"));
        }

        // Extract domain from email
        String domain = email.substring(email.indexOf("@") + 1);

        // Allowed domains
        Set<String> allowedDomains = Set.of("admin.co.kr", "pilot.co.kr", "captain.co.kr", "guest.co.kr", "company.co.kr");
        if (!allowedDomains.contains(domain)) {
            return ResponseEntity.badRequest().body(Map.of("message", "Invalid email domain"));
        }

        boolean isValidUser = false;

        // Domain-based authentication
        switch (domain) {
            case "admin.co.kr":
                isValidUser = adminService.validateUser(email, password);
                break;
            case "pilot.co.kr":
                isValidUser = pilotService.validateUser(email, password);
                break;
            case "captain.co.kr":
                isValidUser = captainService.validateUser(email, password);
                break;
            case "guest.co.kr":
                isValidUser = guestService.validateUser(email, password);
                break;
            case "company.co.kr":
                isValidUser = companyService.validateUser(email, password);
                break;
        }

        if (isValidUser) {
            return ResponseEntity.ok(Map.of(
                    "message", "Login successful",
                    "redirect", "/" + domain.replace(".co.kr", "") + "-dashboard"
            ));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("message", "Invalid credentials"));
        }
    }
}
