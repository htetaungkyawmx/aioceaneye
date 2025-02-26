package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.DroneDTO;
import org.mdt.aioceaneye.model.Drone;
import org.mdt.aioceaneye.service.DroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mdt/drone")
public class DroneController {

    @Autowired
    private DroneService droneService;

    @PostMapping
    public ResponseEntity<Drone> create(@RequestBody DroneDTO droneDTO) {````````````````
        Drone createdDrone = droneService.save(droneDTO);
        return new ResponseEntity<>(createdDrone, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Drone>> getAll() {
        List<Drone> drones = droneService.findAll();
        return new ResponseEntity<>(drones, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Drone> getById(@PathVariable long id) { // Fixed int to long
        return droneService.findById(id)
                .map(drone -> new ResponseEntity<>(drone, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Drone> update(@PathVariable long id, @RequestBody DroneDTO droneDTO) {
        return droneService.update(id, droneDTO)
                .map(updatedDrone -> new ResponseEntity<>(updatedDrone, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        if (droneService.findById(id).isPresent()) { // Check if exists before deleting
            droneService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
