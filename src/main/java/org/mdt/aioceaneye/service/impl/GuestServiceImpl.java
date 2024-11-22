package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.GuestDto;
import org.mdt.aioceaneye.model.Guest;
import org.mdt.aioceaneye.repository.GuestRepository;
import org.mdt.aioceaneye.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // Inject the PasswordEncoder

    @Override
    public Guest save(GuestDto guestDto) {
        Guest guest = Guest.builder()
                .email(guestDto.getEmail())
                .password(passwordEncoder.encode(guestDto.getPassword())) // Encode password on save
                .build();
        return guestRepository.save(guest);
    }

    @Override
    public List<Guest> findAll() {
        return guestRepository.findAll();
    }

    @Override
    public Optional<Guest> findById(int id) {
        return guestRepository.findById(id);
    }

    @Override
    public Guest findByEmail(String email) {
        return guestRepository.findByEmail(email);
    }

    @Override
    public boolean validateUser(String email, String password) {
        Guest guest = guestRepository.findByEmail(email);
        // Check if guest exists and validate the password using PasswordEncoder
        return guest != null && passwordEncoder.matches(password, guest.getPassword());
    }
}
