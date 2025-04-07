package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.DroneLoadoutDto;
import org.mdt.aioceaneye.dto.DroneLoadoutKey;
import org.mdt.aioceaneye.model.DroneLoadout;
import org.mdt.aioceaneye.service.DroneLoadoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drone-loadouts")
public class DroneLoadoutController {

    @Autowired
    private DroneLoadoutService service;

    @PostMapping
    public ResponseEntity<DroneLoadout> create(@RequestBody DroneLoadoutDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<DroneLoadout>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<DroneLoadout> getById(
            @RequestParam Integer droneId,
            @RequestParam String materialSerialno) {
        DroneLoadoutKey key = new DroneLoadoutKey(droneId, materialSerialno);
        return service.findById(key)
                .map(dl -> new ResponseEntity<>(dl, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/id")
    public ResponseEntity<DroneLoadout> update(
            @RequestParam Integer droneId,
            @RequestParam String materialSerialno,
            @RequestBody DroneLoadoutDto dto) {
        DroneLoadoutKey key = new DroneLoadoutKey(droneId, materialSerialno);
        return service.update(key, dto)
                .map(updated -> new ResponseEntity<>(updated, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> delete(
            @RequestParam Integer droneId,
            @RequestParam String materialSerialno) {
        DroneLoadoutKey key = new DroneLoadoutKey(droneId, materialSerialno);
        service.delete(key);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
