package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.MechanicDto;
import org.mdt.aioceaneye.model.Mechanic;
import org.mdt.aioceaneye.repository.MechanicRepo;
import org.mdt.aioceaneye.service.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MechanicServiceImpl implements MechanicService {

    @Autowired
    private MechanicRepo repo;

    @Override
    public Mechanic save(MechanicDto dto) {
        return repo.save(Mechanic.builder()
                .mechanicNo(dto.getMechanicNo())
                .mechanicName(dto.getMechanicName())
                .mechanicEmail(dto.getMechanicEmail())
                .mechanicPosition(dto.getMechanicPosition())
                .mechanicPhone(dto.getMechanicPhone())
                .mechanicSign(dto.getMechanicSign())
                .mechanicImg(dto.getMechanicImg())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<Mechanic> update(String id, MechanicDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setMechanicName(dto.getMechanicName());
            existing.setMechanicEmail(dto.getMechanicEmail());
            existing.setMechanicPosition(dto.getMechanicPosition());
            existing.setMechanicPhone(dto.getMechanicPhone());
            existing.setMechanicSign(dto.getMechanicSign());
            existing.setMechanicImg(dto.getMechanicImg());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<Mechanic> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Mechanic> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
