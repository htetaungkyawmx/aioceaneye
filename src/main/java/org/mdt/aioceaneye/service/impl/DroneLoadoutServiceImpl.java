package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.DroneLoadoutDto;
import org.mdt.aioceaneye.dto.DroneLoadoutKey;
import org.mdt.aioceaneye.model.DroneLoadout;
import org.mdt.aioceaneye.repository.DroneLoadoutRepo;
import org.mdt.aioceaneye.service.DroneLoadoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DroneLoadoutServiceImpl implements DroneLoadoutService {

    @Autowired
    private DroneLoadoutRepo repo;

    @Override
    public DroneLoadout save(DroneLoadoutDto dto) {
        return repo.save(DroneLoadout.builder()
                .droneId(dto.getDroneId())
                .materialSerialNo(dto.getMaterialSerialNo())
                .materialItem(dto.getMaterialItem())
                .build());
    }

    @Override
    public Optional<DroneLoadout> update(DroneLoadoutKey id, DroneLoadoutDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setMaterialItem(dto.getMaterialItem());
            return repo.save(existing);
        });
    }

    @Override
    public List<DroneLoadout> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<DroneLoadout> findById(DroneLoadoutKey id) {
        return repo.findById(id);
    }

    @Override
    public void delete(DroneLoadoutKey id) {
        repo.deleteById(id);
    }
}
