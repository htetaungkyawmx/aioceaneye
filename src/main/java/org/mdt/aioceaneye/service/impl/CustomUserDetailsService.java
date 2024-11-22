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
        // Extract the domain to determine the role
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        switch (domain) {
            case "admin":
                Admin admin = adminRepository.findByEmail(email);
                if (admin != null) {
                    return createUserDetails(email, admin.getPassword(), "ROLE_ADMIN");
                }
                break;
            case "pilot":
                Pilot pilot = pilotRepository.findByEmail(email);
                if (pilot != null) {
                    return createUserDetails(email, pilot.getPassword(), "ROLE_PILOT");
                }
                break;
            case "captain":
                Captain captain = captainRepository.findByEmail(email);
                if (captain != null) {
                    return createUserDetails(email, captain.getPassword(), "ROLE_CAPTAIN");
                }
                break;
            case "guest":
                Guest guest = guestRepository.findByEmail(email);
                if (guest != null) {
                    return createUserDetails(email, guest.getPassword(), "ROLE_GUEST");
                }
                break;
            case "company":
                Company company = companyRepository.findByEmail(email);
                if (company != null) {
                    return createUserDetails(email, company.getPassword(), "ROLE_COMPANY");
                }
                break;
            default:
                throw new UsernameNotFoundException("Invalid email domain for: " + email);
        }

        throw new UsernameNotFoundException("User not found with email: " + email);
    }

    private UserDetails createUserDetails(String email, String password, String role) {
        return new User(email, password, Collections.singletonList(new SimpleGrantedAuthority(role)));
    }
}
