package org.mdt.aioceaneye.controller;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.material.MaterialDetailsInfo;
import org.mdt.aioceaneye.dto.material.MaterialInfo;
import org.mdt.aioceaneye.dto.material.MaterialRegisterForm;
import org.mdt.aioceaneye.service.MaterialService;
import org.mdt.aioceaneye.service.MaterialTypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mdt/materials")
public class MaterialController {

    private final MaterialService materialService;
    private final MaterialTypeService materialTypeService;

    @PostMapping
    public ResponseEntity<String> registerMaterial(@RequestBody MaterialRegisterForm form) {
        return materialService.registerMaterial(form);
    }

    @PostMapping("/type")
    public ResponseEntity<String> createMaterialType(@RequestBody String typeName) {
        return materialTypeService.createMaterialType(typeName);
    }

    @GetMapping
    public List<MaterialInfo> getAllMaterialInfos() {
        return materialService.getAllMaterialInfos();
    }

    @GetMapping("/{serialNo}")
    public MaterialDetailsInfo getMaterialDetailsInfo(@PathVariable String serialNo) {
        return materialService.getMaterialDetailsInfo(serialNo);
    }

    @DeleteMapping("/{serialNo}")
    public ResponseEntity<String> deleteMaterial(@PathVariable String serialNo) {
        return materialService.deleteMaterial(serialNo);
    }

}
