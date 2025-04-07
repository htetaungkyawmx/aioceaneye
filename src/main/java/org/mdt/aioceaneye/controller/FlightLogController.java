package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.FlightLogDto;
import org.mdt.aioceaneye.model.FlightLog;
import org.mdt.aioceaneye.service.FlightLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flightlogs")
public class FlightLogController {

    @Autowired
    private FlightLogService service;

    @PostMapping
    public ResponseEntity<FlightLog> create(@RequestBody FlightLogDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<FlightLog>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FlightLog> getById(@PathVariable String id) {
        return service.findById(id)
                .map(data -> new ResponseEntity<>(data, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FlightLog> update(@PathVariable String id, @RequestBody FlightLogDto dto) {
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
