package org.mdt.aioceaneye.service;

import org.springframework.http.ResponseEntity;

public interface MaterialTypeService {

    ResponseEntity<String> createMaterialType(String typeName);
}
