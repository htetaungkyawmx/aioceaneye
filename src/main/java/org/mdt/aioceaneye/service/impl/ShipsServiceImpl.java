package org.mdt.aioceaneye.service.impl;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.ship.ShipInfo;
import org.mdt.aioceaneye.dto.ship.ShipRegisterForm;
import org.mdt.aioceaneye.model.Ship;
import org.mdt.aioceaneye.repository.CompanysRepo;
import org.mdt.aioceaneye.repository.ShipRepo;
import org.mdt.aioceaneye.service.ShipsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShipsServiceImpl implements ShipsService {

    private final ShipRepo shipRepo;
    private final CompanysRepo companyRepo;

    @Override
    public ResponseEntity<String> registerShip(ShipRegisterForm form) {
        var company = companyRepo.findById(form.coId()).get();
        var ship = ShipRegisterForm.toEntity(form);
        ship.setCompany(company);
        shipRepo.save(ship);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ship: " + ship.getShipName() + " for Company: " + ship.getCompany().getCoName() + " registered successfully");
    }

    @Override
    public List<ShipInfo> getAllShipInfos() {
        return shipRepo.findAllShipInfos();
    }

    @Override
    public ResponseEntity<String> deleteShip(long shipId) {
        if(shipRepo.existsById(shipId)) {
            shipRepo.deleteById(shipId);
            return ResponseEntity.status(HttpStatus.OK).body("Ship: " + shipId + " deleted successfully");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ship: " + shipId + " not found");
    }

    @Override
    public ResponseEntity<String> updateShip(ShipRegisterForm form, long shipId) {
        if(shipRepo.existsById(shipId)) {
            var ship = shipRepo.findById(shipId).get();
            ship.setShipName(form.shipName());
            ship.setShipCallSign(form.shipCallSign());
            ship.setShipCountry(form.shipCountry());
            ship.setShipOfficeNo(form.shipOfficeNo());
            ship.setShipImono(form.shipImono());
            ship.setShipMmsi(form.shipMmsi());
            ship.setShipPhone(form.shipPhone());
            ship.setShipEmail(form.shipEmail());
            ship.setShipLogo(form.shipLogo());
            ship.setYield(form.yield());
            shipRepo.save(ship);
            return ResponseEntity.status(HttpStatus.OK).body("Ship: " + ship.getShipName() + " updated successfully");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ship: " + shipId + " not found");
    }

    @Override
    public ResponseEntity<String> setCompany(long coId, long shipId) {
        if(!shipRepo.existsById(shipId)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ship: " + shipId + " not found");
        }
        if(!companyRepo.existsById(coId)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Company: " + coId + " not found");
        }
        var ship = shipRepo.findById(shipId).get();
        var company = companyRepo.findById(coId).get();
        ship.setCompany(company);

        shipRepo.save(ship);
        companyRepo.save(company);

        return ResponseEntity.status(HttpStatus.OK)
                .body("Ship: " + ship.getShipName() + " is set to Company : " + ship.getCompany().getCoName());
    }
}
