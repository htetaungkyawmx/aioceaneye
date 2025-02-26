package org.mdt.aioceaneye.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.model.MaterialType;
import org.mdt.aioceaneye.repository.MaterialTypeRepo;
import org.mdt.aioceaneye.service.MaterialTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class MaterialTypeServiceImpl implements MaterialTypeService {

    private final MaterialTypeRepo materialTypeRepo;

    @Override
    public ResponseEntity<String> createMaterialType(String typeName) {
        var type = new MaterialType();
        type.setTypeName(typeName);
        materialTypeRepo.save(type);
        return ResponseEntity.status(HttpStatus.CREATED).body("Type: " + typeName + " has been created");
    }
}
