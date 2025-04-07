package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.SparePartDto;
import org.mdt.aioceaneye.model.SparePart;

import java.util.List;
import java.util.Optional;

public interface SparePartService {
    SparePart save(SparePartDto dto);
    Optional<SparePart> update(Integer id, SparePartDto dto);
    List<SparePart> findAll();
    Optional<SparePart> findById(Integer id);
    void delete(Integer id);
}
