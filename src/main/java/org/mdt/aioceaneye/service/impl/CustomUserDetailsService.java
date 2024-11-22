package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.model.*;
import org.mdt.aioceaneye.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PilotRepository pilotRepository;

    @Autowired
    private CaptainRepository captainRepository;

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // Extract the domain from the email
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        // Determine role and fetch user data based on the domain
        switch (domain) {
            case "admin":
                return loadAdmin(email);
            case "pilot":
                return loadPilot(email);
            case "captain":
                return loadCaptain(email);
            case "guest":
                return loadGuest(email);
            case "company":
                return loadCompany(email);
            default:
                throw new UsernameNotFoundException("Invalid domain for email: " + email);
        }
    }

    private UserDetails loadAdmin(String email) {
        Admin admin = adminRepository.findByEmail(email);
        if (admin == null) {
            throw new UsernameNotFoundException("Admin not found with email: " + email);
        }
        return createUserDetails(admin.getEmail(), admin.getPassword(), "ROLE_ADMIN");
    }

    private UserDetails loadPilot(String email) {
        Pilot pilot = pilotRepository.findByEmail(email);
        if (pilot == null) {
            throw new UsernameNotFoundException("Pilot not found with email: " + email);
        }
        return createUserDetails(pilot.getEmail(), pilot.getPassword(), "ROLE_PILOT");
    }

    private UserDetails loadCaptain(String email) {
        Captain captain = captainRepository.findByEmail(email);
        if (captain == null) {
            throw new UsernameNotFoundException("Captain not found with email: " + email);
        }
        return createUserDetails(captain.getEmail(), captain.getPassword(), "ROLE_CAPTAIN");
    }

    private UserDetails loadGuest(String email) {
        Guest guest = guestRepository.findByEmail(email);
        if (guest == null) {
            throw new UsernameNotFoundException("Guest not found with email: " + email);
        }
        return createUserDetails(guest.getEmail(), guest.getPassword(), "ROLE_GUEST");
    }

    private UserDetails loadCompany(String email) {
        Company company = companyRepository.findByEmail(email);
        if (company == null) {
            throw new UsernameNotFoundException("Company not found with email: " + email);
        }
        return createUserDetails(company.getEmail(), company.getPassword(), "ROLE_COMPANY");
    }

    private UserDetails createUserDetails(String email, String password, String role) {
        return new User(email, password, Collections.singletonList(new SimpleGrantedAuthority(role)));
    }
}
