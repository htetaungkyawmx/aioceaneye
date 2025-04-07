package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.VideoDto;
import org.mdt.aioceaneye.model.Video;

import java.util.List;
import java.util.Optional;

public interface VideoService {
    Video save(VideoDto dto);
    Optional<Video> update(String id, VideoDto dto);
    List<Video> findAll();
    Optional<Video> findById(String id);
    void delete(String id);
}
