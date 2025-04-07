package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.ShipsDto;
import org.mdt.aioceaneye.model.Ships;
import org.mdt.aioceaneye.service.ShipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ships")
public class ShipsController {

    @Autowired
    private ShipsService shipsService;

    @PostMapping
    public ResponseEntity<Ships> create(@RequestBody ShipsDto shipsDto) {
        Ships createdShips = shipsService.save(shipsDto);
        return new ResponseEntity<>(createdShips, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Ships>> getAll() {
        List<Ships> ships = shipsService.findAll();
        return new ResponseEntity<>(ships, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ships> getById(@PathVariable int id) {
        return shipsService.findById(id)
                .map(ships -> new ResponseEntity<>(ships, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ships> update(@PathVariable int id, @RequestBody ShipsDto shipsDto) {
        return shipsService.update(id, shipsDto)
                .map(updatedShip -> new ResponseEntity<>(updatedShip, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        shipsService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
