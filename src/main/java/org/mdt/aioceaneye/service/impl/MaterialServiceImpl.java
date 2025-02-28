package org.mdt.aioceaneye.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.material.MaterialDetailsInfo;
import org.mdt.aioceaneye.dto.material.MaterialInfo;
import org.mdt.aioceaneye.dto.material.MaterialLogDto;
import org.mdt.aioceaneye.dto.material.MaterialRegisterForm;
import org.mdt.aioceaneye.repository.MaterialRepo;
import org.mdt.aioceaneye.repository.MaterialTypeRepo;
import org.mdt.aioceaneye.service.MaterialService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MaterialServiceImpl implements MaterialService {

    private final MaterialRepo materialRepo;
    private final MaterialTypeRepo materialTypeRepo;

    @Override
    public ResponseEntity<String> registerMaterial(MaterialRegisterForm form) {
        var type = materialTypeRepo.findById(form.typeId()).get();
        var material = MaterialRegisterForm.toEntity(form);
        material.setMaterialType(type);
        materialRepo.save(material);
        return ResponseEntity.status(HttpStatus.CREATED).body("Material : " + material.getSerialNumber() + " registered successfully");
    }

    @Override
    public List<MaterialInfo> getAllMaterialInfos() {
        return materialRepo.getAllMaterialInfos();
    }

    @Override
    public MaterialDetailsInfo getMaterialDetailsInfo(String serialNo) {
        return materialRepo.getMaterialDetailsInfoBySerialNumber(serialNo);
    }

    @Override
    public ResponseEntity<String> updateMaterial(MaterialRegisterForm form) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteMaterial(String serialNo) {
        if(materialRepo.existsById(serialNo)) {
            materialRepo.deleteById(serialNo);
            return ResponseEntity.status(HttpStatus.OK).body("Material : " + serialNo + " deleted successfully");
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Material : " + serialNo + " not found");
    }

    @Override
    public MaterialLogDto createMaterialLog(int droneId, String materialSerialNo) {
        return null;
    }
}
