package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepo extends JpaRepository<Video, String> {

}
