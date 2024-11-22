package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.AdminDto;
import org.mdt.aioceaneye.model.Admin;
import org.mdt.aioceaneye.repository.AdminRepository;
import org.mdt.aioceaneye.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = Admin.builder()
                .email(adminDto.getEmail())
                .password(passwordEncoder.encode(adminDto.getPassword())) // Hash password here
                .build();
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Override
    public boolean validateUser(String email, String password) {
        Admin admin = adminRepository.findByEmail(email);
        return admin != null && passwordEncoder.matches(password, admin.getPassword());
    }

}
