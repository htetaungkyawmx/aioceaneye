package org.mdt.aioceaneye.config;

import org.mdt.aioceaneye.util.JwtFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    private final JwtFilter jwtFilter;

    public SecurityConfig(JwtFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/login", "/org/admin/create").permitAll() // Public endpoints
                        .requestMatchers("/org/admin/**").hasRole("ADMIN") // Requires ROLE_ADMIN
                        .requestMatchers("/org/pilot/**").hasRole("PILOT") // Requires ROLE_PILOT
                        .requestMatchers("/org/captain/**").hasRole("CAPTAIN") // Requires ROLE_CAPTAIN
                        .requestMatchers("/org/guest/**").hasRole("GUEST") // Requires ROLE_GUEST
                        .requestMatchers("/org/company/**").hasRole("COMPANY") // Requires ROLE_COMPANY
                        .anyRequest().authenticated() // All other requests require authentication
                )
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
}
