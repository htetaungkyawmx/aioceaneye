package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.FishInfoDto;
import org.mdt.aioceaneye.model.FishInfo;

import java.util.List;
import java.util.Optional;

public interface FishInfoService {
    FishInfo save(FishInfoDto dto);
    Optional<FishInfo> update(Integer id, FishInfoDto dto);
    List<FishInfo> findAll();
    Optional<FishInfo> findById(Integer id);
    void delete(Integer id);
}
