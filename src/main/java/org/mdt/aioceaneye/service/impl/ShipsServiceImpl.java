package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.ShipsDto;
import org.mdt.aioceaneye.model.Ships;
import org.mdt.aioceaneye.repository.ShipsRepo;
import org.mdt.aioceaneye.service.ShipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipsServiceImpl implements ShipsService {

    @Autowired
    private ShipsRepo shipsRepo;

    @Override
    public Ships save(ShipsDto shipsDto) {
        Ships ships = Ships.builder()
                .ship_name(shipsDto.getShip_name())
                .ship_desc(shipsDto.getShip_desc())
                .ship_captain_name(shipsDto.getShip_captain_name())
                .ship_1th_name(shipsDto.getShip_1th_name())
                .ship_2th_name(shipsDto.getShip_2th_name())
                .ship_3th_name(shipsDto.getShip_3th_name())
                .ship_captain_email(shipsDto.getShip_captain_email())
                .ship_1th_email(shipsDto.getShip_1th_email())
                .ship_2th_email(shipsDto.getShip_2th_email())
                .ship_3th_email(shipsDto.getShip_3th_email())
                .ship_callsign(shipsDto.getShip_callsign())
                .ship_class(shipsDto.getShip_class())
                .ship_country(shipsDto.getShip_country())
                .ship_mmsi(shipsDto.getShip_mmsi())
                .ship_imono(shipsDto.getShip_imono())
                .ship_office_no(shipsDto.getShip_office_no())
                .yield(shipsDto.getYield())
                .build_year(shipsDto.getBuild_year())
                .co_id(shipsDto.getCo_id())
                .ship_logo_path(shipsDto.getShip_logo_path())
                .created_at(shipsDto.getCreated_at())
                .created_user(shipsDto.getCreated_user())
                .modified_at(shipsDto.getModified_at())
                .modified_user(shipsDto.getModified_user())
                .build();
        return shipsRepo.save(ships);
    }

    @Override
    public Optional<Ships> update(int id, ShipsDto shipsDto) {
        return shipsRepo.findById(id).map(existingShips -> {
            existingShips.setShip_name(shipsDto.getShip_name());
            existingShips.setShip_desc(shipsDto.getShip_desc());
            existingShips.setShip_captain_name(shipsDto.getShip_captain_name());
            existingShips.setShip_1th_name(shipsDto.getShip_1th_name());
            existingShips.setShip_2th_name(shipsDto.getShip_2th_name());
            existingShips.setShip_3th_name(shipsDto.getShip_3th_name());
            existingShips.setShip_captain_email(shipsDto.getShip_captain_email());
            existingShips.setShip_1th_email(shipsDto.getShip_1th_email());
            existingShips.setShip_2th_email(shipsDto.getShip_2th_email());
            existingShips.setShip_3th_email(shipsDto.getShip_3th_email());
            existingShips.setShip_callsign(shipsDto.getShip_callsign());
            existingShips.setShip_class(shipsDto.getShip_class());
            existingShips.setShip_country(shipsDto.getShip_country());
            existingShips.setShip_mmsi(shipsDto.getShip_mmsi());
            existingShips.setShip_imono(shipsDto.getShip_imono());
            existingShips.setShip_office_no(shipsDto.getShip_office_no());
            existingShips.setYield(shipsDto.getYield());
            existingShips.setBuild_year(shipsDto.getBuild_year());
            existingShips.setCo_id(shipsDto.getCo_id());
            existingShips.setShip_logo_path(shipsDto.getShip_logo_path());
            existingShips.setCreated_at(shipsDto.getCreated_at());
            existingShips.setCreated_user(shipsDto.getCreated_user());
            existingShips.setModified_at(shipsDto.getModified_at());
            existingShips.setModified_user(shipsDto.getModified_user());
            return shipsRepo.save(existingShips);
        });
    }

    @Override
    public List<Ships> findAll() {
        return shipsRepo.findAll();
    }

    @Override
    public Optional<Ships> findById(int id) {
        return shipsRepo.findById(id);
    }

    @Override
    public void delete(int id) {
        shipsRepo.deleteById(id);
    }
}
