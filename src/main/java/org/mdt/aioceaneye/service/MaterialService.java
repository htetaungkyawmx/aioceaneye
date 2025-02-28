package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.material.MaterialDetailsInfo;
import org.mdt.aioceaneye.dto.material.MaterialInfo;
import org.mdt.aioceaneye.dto.material.MaterialLogDto;
import org.mdt.aioceaneye.dto.material.MaterialRegisterForm;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MaterialService {

    ResponseEntity<String> registerMaterial(MaterialRegisterForm form);

    List<MaterialInfo> getAllMaterialInfos();

    MaterialDetailsInfo getMaterialDetailsInfo(String serialNo);

    ResponseEntity<String> updateMaterial(MaterialRegisterForm form);

    ResponseEntity<String> deleteMaterial(String serialNo);

    MaterialLogDto createMaterialLog(int droneId, String materialSerialNo);
}
