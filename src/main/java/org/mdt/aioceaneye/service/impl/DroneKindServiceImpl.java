package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.DroneKindDTO;
import org.mdt.aioceaneye.model.DroneKind;
import org.mdt.aioceaneye.repository.DroneKindRepo;
import org.mdt.aioceaneye.service.DroneKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DroneKindServiceImpl implements DroneKindService {

    @Autowired
    private DroneKindRepo droneKindRepo;

    @Override
    public DroneKind save(DroneKindDTO droneKindDTO) {
        DroneKind droneKind = DroneKind.builder()
                .kind(droneKindDTO.getKind())
                .characteristics(droneKindDTO.getCharacteristics())
                .application(droneKindDTO.getApplication())
                .build();
        return droneKindRepo.save(droneKind);
    }

    @Override
    public Optional<DroneKind> update(int kind_id, DroneKindDTO droneKindDTO) {
        return droneKindRepo.findById(kind_id).map(existingDroneKind -> {
            existingDroneKind.setKind(droneKindDTO.getKind());
            existingDroneKind.setCharacteristics(droneKindDTO.getCharacteristics());
            existingDroneKind.setApplication(droneKindDTO.getApplication());
            return droneKindRepo.save(existingDroneKind);
        });
    }

    @Override
    public List<DroneKind> findAll() {
        return droneKindRepo.findAll();
    }

    @Override
    public Optional<DroneKind> findById(int kind_id) {
        return droneKindRepo.findById(kind_id);
    }

    @Override
    public void delete(int kind_id) {
        if (droneKindRepo.existsById(kind_id)) {
            droneKindRepo.deleteById(kind_id);
        }
    }
}

