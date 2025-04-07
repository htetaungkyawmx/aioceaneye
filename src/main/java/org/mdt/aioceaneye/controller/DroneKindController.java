package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.DroneKindDto;
import org.mdt.aioceaneye.model.DroneKind;
import org.mdt.aioceaneye.service.DroneKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dronekind")
public class DroneKindController {

    @Autowired
    private DroneKindService service;

    @PostMapping
    public ResponseEntity<DroneKind> create(@RequestBody DroneKindDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<DroneKind>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DroneKind> getById(@PathVariable int id) {
        return service.findById(id)
                .map(kind -> new ResponseEntity<>(kind, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DroneKind> update(@PathVariable int id, @RequestBody DroneKindDto dto) {
        return service.update(id, dto)
                .map(updated -> new ResponseEntity<>(updated, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
