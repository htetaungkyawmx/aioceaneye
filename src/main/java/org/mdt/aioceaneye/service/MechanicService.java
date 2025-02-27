package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.mechanic.MechanicDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface MechanicService {

    ResponseEntity<String> registerMechanic(MechanicDto form);

    List<MechanicDto> getAllMechanics();

    MechanicDto getMechanicDtoBySerialNumber(String serialNumber);

}
