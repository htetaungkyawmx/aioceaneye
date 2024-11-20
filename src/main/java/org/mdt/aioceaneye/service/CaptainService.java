package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.CaptainDto;
import org.mdt.aioceaneye.model.Captain;

import java.util.List;

public interface CaptainService {
    Captain save(CaptainDto captainDto);
    List<Captain> findAll();

}
