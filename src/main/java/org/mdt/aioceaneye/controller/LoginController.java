package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.JwtResponse;
import org.mdt.aioceaneye.dto.LoginRequest;
import org.mdt.aioceaneye.service.*;
import org.mdt.aioceaneye.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private PilotService pilotService;
    @Autowired
    private CaptainService captainService;
    @Autowired
    private GuestService guestService;
    @Autowired
    private CompanyService companyService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        if (email == null || password == null) {
            return ResponseEntity.badRequest().body(Map.of("message", "Email and password are required"));
        }

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        boolean isValidUser = false;
        String role = "";

        switch (domain) {
            case "admin":
                isValidUser = adminService.validateUser(email, password);
                role = "ROLE_ADMIN";
                break;
            case "pilot":
                isValidUser = pilotService.validateUser(email, password);
                role = "ROLE_PILOT";
                break;
            case "captain":
                isValidUser = captainService.validateUser(email, password);
                role = "ROLE_CAPTAIN";
                break;
            case "guest":
                isValidUser = guestService.validateUser(email, password);
                role = "ROLE_GUEST";
                break;
            case "company":
                isValidUser = companyService.validateUser(email, password);
                role = "ROLE_COMPANY";
                break;
            default:
                return ResponseEntity.badRequest().body(Map.of("message", "Invalid domain"));
        }

        if (isValidUser) {
            String token = jwtUtil.generateToken(email, role);
            return ResponseEntity.ok(new JwtResponse(token, email, role));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("message", "Invalid credentials"));
        }
    }
}
