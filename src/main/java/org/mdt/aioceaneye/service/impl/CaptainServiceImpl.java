package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.CaptainDto;
import org.mdt.aioceaneye.model.Captain;
import org.mdt.aioceaneye.repository.CaptainRepository;
import org.mdt.aioceaneye.service.CaptainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaptainServiceImpl implements CaptainService {

    @Autowired
    private CaptainRepository captainRepository;

    @Override
    public Captain save(CaptainDto captainDto) {
        Captain captain = Captain
                .builder()
                .email(captainDto.getEmail())
                .password(captainDto.getPassword())
                .build();
        return captainRepository.save(captain);
    }

    @Override
    public List<Captain> findAll() {
        return captainRepository.findAll();
    }
}
