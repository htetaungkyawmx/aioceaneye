package org.mdt.aioceaneye.service.impl;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // Simulate fetching user details from the database
        if ("john@admin.co.kr".equals(email)) {
            return new User(
                    email,
                    "$2a$10$7r9S2FI3mDU8R1Kfs2Qeou8.MPHG9peGkxE7GUn6/Ax8wG99Ob/Uu",
                    Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN"))
            );
        }

        throw new UsernameNotFoundException("User not found with email: " + email);
    }
}
