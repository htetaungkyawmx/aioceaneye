package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.CaptainDto;
import org.mdt.aioceaneye.model.Captain;

import java.util.List;
import java.util.Optional;

public interface CaptainService {
    Captain save(CaptainDto captainDto); // Save captain details
    List<Captain> findAll(); // Get all captains
    Optional<Captain> findById(int id); // Find a captain by ID
    Captain findByEmail(String email); // Find a captain by email
    boolean validateUser(String email, String password); // Validate login credentials
}
