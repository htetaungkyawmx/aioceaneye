package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.DroneKindDTO;
import org.mdt.aioceaneye.model.DroneKind;
import org.mdt.aioceaneye.service.DroneKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mdt/drone_kind")
public class DroneKindController {

    @Autowired
    private DroneKindService droneKindService;

    @PostMapping
    public ResponseEntity<DroneKind> create(@RequestBody DroneKindDTO droneKindDTO) {
        DroneKind createdDroneKind = droneKindService.save(droneKindDTO);
        return new ResponseEntity<>(createdDroneKind, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<DroneKind>> getAll() {
        List<DroneKind> droneKinds = droneKindService.findAll();
        return new ResponseEntity<>(droneKinds, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DroneKind> getById(@PathVariable int kind_id) { // Fixed int to long
        return droneKindService.findById(kind_id)
                .map(droneKind -> new ResponseEntity<>(droneKind, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DroneKind> update(@PathVariable long id, @RequestBody DroneKindDTO droneKindDTO) {
        return droneKindService.update(droneKindDTO.getKind_id(), droneKindDTO)
                .map(updatedDroneKind -> new ResponseEntity<>(updatedDroneKind, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int kind_id) {
        if (droneKindService.findById(kind_id).isPresent()) { // Check if exists before deleting
            droneKindService.delete(kind_id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
