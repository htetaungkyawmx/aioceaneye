package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.FlightLogVideoDto;
import org.mdt.aioceaneye.model.FlightLogVideo;
import org.mdt.aioceaneye.repository.FlightLogVideoRepo;
import org.mdt.aioceaneye.service.FlightLogVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightLogVideoServiceImpl implements FlightLogVideoService {

    @Autowired
    private FlightLogVideoRepo repo;

    @Override
    public FlightLogVideo save(FlightLogVideoDto dto) {
        return repo.save(FlightLogVideo.builder()
                .flightlogId(dto.getFlightlogId())
                .videoId(dto.getVideoId())
                .videoType(dto.getVideoType())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<FlightLogVideo> update(String id, FlightLogVideoDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setVideoId(dto.getVideoId());
            existing.setVideoType(dto.getVideoType());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<FlightLogVideo> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<FlightLogVideo> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
