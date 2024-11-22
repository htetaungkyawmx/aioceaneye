package org.mdt.aioceaneye.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationService {

    @Autowired
    private AdminService adminService;
    @Autowired private PilotService pilotService;
    @Autowired private CaptainService captainService;
    @Autowired private GuestService guestService;
    @Autowired private CompanyService companyService;

    public boolean validateUser(String role, String email, String password) {
        switch (role.toLowerCase()) {
            case "admin": return adminService.validateUser(email, password);
            case "pilot": return pilotService.validateUser(email, password);
            case "captain": return captainService.validateUser(email, password);
            case "guest": return guestService.validateUser(email, password);
            case "company": return companyService.validateUser(email, password);
            default: throw new IllegalArgumentException("Invalid role: " + role);
        }
    }
}
