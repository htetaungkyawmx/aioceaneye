package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.PostFlightLogDto;
import org.mdt.aioceaneye.model.PostFlightLog;

import java.util.List;
import java.util.Optional;

public interface PostFlightLogService {
    PostFlightLog save(PostFlightLogDto dto);
    Optional<PostFlightLog> update(String id, PostFlightLogDto dto);
    List<PostFlightLog> findAll();
    Optional<PostFlightLog> findById(String id);
    void delete(String id);
}
