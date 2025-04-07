package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.PilotDto;
import org.mdt.aioceaneye.model.Pilot;
import org.mdt.aioceaneye.repository.PilotRepo;
import org.mdt.aioceaneye.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PilotServiceImpl implements PilotService {

    @Autowired
    private PilotRepo repo;

    @Override
    public Pilot save(PilotDto dto) {
        return repo.save(Pilot.builder()
                .pilotId(dto.getPilotId())
                .pilotName(dto.getPilotName())
                .pilotCertno(dto.getPilotCertno())
                .pilotPassport(dto.getPilotPassport())
                .pilotEmail(dto.getPilotEmail())
                .pilotPhone(dto.getPilotPhone())
                .pilotCountry(dto.getPilotCountry())
                .pilotGrade(dto.getPilotGrade())
                .pilotPhotoPath(dto.getPilotPhotoPath())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<Pilot> update(String id, PilotDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setPilotName(dto.getPilotName());
            existing.setPilotCertno(dto.getPilotCertno());
            existing.setPilotPassport(dto.getPilotPassport());
            existing.setPilotEmail(dto.getPilotEmail());
            existing.setPilotPhone(dto.getPilotPhone());
            existing.setPilotCountry(dto.getPilotCountry());
            existing.setPilotGrade(dto.getPilotGrade());
            existing.setPilotPhotoPath(dto.getPilotPhotoPath());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<Pilot> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Pilot> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
