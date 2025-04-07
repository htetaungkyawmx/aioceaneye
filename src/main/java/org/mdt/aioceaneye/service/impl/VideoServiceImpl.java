package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.VideoDto;
import org.mdt.aioceaneye.model.Video;
import org.mdt.aioceaneye.repository.VideoRepo;
import org.mdt.aioceaneye.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoRepo repo;

    @Override
    public Video save(VideoDto dto) {
        return repo.save(Video.builder()
                .videoId(dto.getVideoId())
                .videoName(dto.getVideoName())
                .videoPath(dto.getVideoPath())
                .videoType(dto.getVideoType())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<Video> update(String id, VideoDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setVideoName(dto.getVideoName());
            existing.setVideoPath(dto.getVideoPath());
            existing.setVideoType(dto.getVideoType());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<Video> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Video> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
