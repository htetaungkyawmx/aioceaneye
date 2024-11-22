package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.AdminDto;
import org.mdt.aioceaneye.model.Admin;
import org.mdt.aioceaneye.service.AdminService;
import org.mdt.aioceaneye.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/org/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/create")
    public ResponseEntity<Admin> create(@RequestBody AdminDto adminDto) {
        Admin createdAdmin = adminService.save(adminDto);
        return new ResponseEntity<>(createdAdmin, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Admin>> getAll() {
        List<Admin> admins = adminService.findAll();
        return new ResponseEntity<>(admins, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AdminDto adminDto) {
        boolean isValid = adminService.validateUser(adminDto.getEmail(), adminDto.getPassword());
        if (isValid) {
            String token = jwtUtil.generateToken(adminDto.getEmail(), "ROLE_ADMIN");
            return ResponseEntity.ok().body(token);
        }
        return new ResponseEntity<>("Invalid email or password", HttpStatus.UNAUTHORIZED);
    }
}
