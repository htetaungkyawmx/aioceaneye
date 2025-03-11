package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.material.MaterialDetailsInfo;
import org.mdt.aioceaneye.dto.material.MaterialInfo;
import org.mdt.aioceaneye.dto.material.MaterialRegisterForm;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MaterialService {

    ResponseEntity<String> registerMaterial(MaterialRegisterForm form);

    List<MaterialInfo> getAllMaterialInfos();

    MaterialDetailsInfo getMaterialDetailsInfo(String serialNo);

    ResponseEntity<String> updateMaterial(MaterialRegisterForm form);

    ResponseEntity<String> deleteMaterial(String serialNo);

    void createMaterialLog(String droneSerialNo, String materialSerialNo);

    // To get the list of unused materials by material type when drone register
    List<MaterialInfo> getUnusedMaterialInfosByMaterialType(String materialType);


    List<MaterialInfo> getListOfMaterialsUsedByDrone(long droneId);
}
