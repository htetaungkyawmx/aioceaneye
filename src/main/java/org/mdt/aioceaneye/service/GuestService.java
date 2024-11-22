package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.GuestDto;
import org.mdt.aioceaneye.model.Guest;

import java.util.List;
import java.util.Optional;

public interface GuestService {
    Guest save(GuestDto guestDto); // Save guest details
    List<Guest> findAll(); // Get all guests
    Optional<Guest> findById(int id); // Find a guest by ID
    Guest findByEmail(String email); // Find a guest by email
    boolean validateUser(String email, String password); // Validate login credentials
}
