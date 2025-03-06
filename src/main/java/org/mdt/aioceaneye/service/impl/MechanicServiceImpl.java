package org.mdt.aioceaneye.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.mechanic.MechanicDto;
import org.mdt.aioceaneye.repository.MechanicRepo;
import org.mdt.aioceaneye.service.MechanicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class MechanicServiceImpl implements MechanicService {

    private final MechanicRepo mechanicRepo;

    @Override
    public ResponseEntity<String> registerMechanic(MechanicDto form) {
        var mechanic = mechanicRepo.save(MechanicDto.toEntity(form));
        return ResponseEntity.status(HttpStatus.CREATED).body("Mechanic: " + mechanic.getMechanicName() + " registered successfully");
    }

    @Override
    public List<MechanicDto> getAllMechanics() {
        return mechanicRepo.findAll().stream().map(MechanicDto::toDto).collect(Collectors.toList());
    }

    @Override
    public MechanicDto getMechanicDtoBySerialNumber(String serialNumber) {
        return mechanicRepo.findById(serialNumber).map(MechanicDto::toDto).orElse(null);
    }
}
