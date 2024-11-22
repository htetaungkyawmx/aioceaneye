package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.AdminDto;
import org.mdt.aioceaneye.model.Admin;

import java.util.List;

public interface AdminService {
    Admin save(AdminDto adminDto);
    List<Admin> findAll();
    boolean validateUser(String email, String password);
}
