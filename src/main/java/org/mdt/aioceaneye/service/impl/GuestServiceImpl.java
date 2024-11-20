package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.GuestDto;
import org.mdt.aioceaneye.model.Guest;
import org.mdt.aioceaneye.repository.GuestRepository;
import org.mdt.aioceaneye.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public Guest save(GuestDto guestDto) {
        Guest guest = Guest
                .builder()
                .email(guestDto.getEmail())
                .password(guestDto.getPassword())
                .build();
        return guestRepository.save(guest);
    }

    @Override
    public List<Guest> findAll() {
        return guestRepository.findAll();
    }
}
