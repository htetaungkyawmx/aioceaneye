package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.FlightLogVideoDto;
import org.mdt.aioceaneye.model.FlightLogVideo;

import java.util.List;
import java.util.Optional;

public interface FlightLogVideoService {
    FlightLogVideo save(FlightLogVideoDto dto);
    Optional<FlightLogVideo> update(String id, FlightLogVideoDto dto);
    List<FlightLogVideo> findAll();
    Optional<FlightLogVideo> findById(String id);
    void delete(String id);
}
