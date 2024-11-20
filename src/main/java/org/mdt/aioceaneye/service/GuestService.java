package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.GuestDto;
import org.mdt.aioceaneye.model.Guest;

import java.util.List;

public interface GuestService {
    Guest save(GuestDto guestDto);
    List<Guest> findAll();

}
