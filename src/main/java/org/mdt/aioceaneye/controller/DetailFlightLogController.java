package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.DetailFlightLogDto;
import org.mdt.aioceaneye.model.DetailFlightLog;
import org.mdt.aioceaneye.service.DetailFlightLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detail-flightlogs")
public class DetailFlightLogController {

    @Autowired
    private DetailFlightLogService service;

    @PostMapping
    public ResponseEntity<DetailFlightLog> create(@RequestBody DetailFlightLogDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<DetailFlightLog>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailFlightLog> getById(@PathVariable String id) {
        return service.findById(id)
                .map(data -> new ResponseEntity<>(data, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetailFlightLog> update(@PathVariable String id, @RequestBody DetailFlightLogDto dto) {
        return service.update(id, dto)
                .map(data -> new ResponseEntity<>(data, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
