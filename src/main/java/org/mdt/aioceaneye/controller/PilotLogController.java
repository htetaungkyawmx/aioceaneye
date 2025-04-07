package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.PilotLogDto;
import org.mdt.aioceaneye.model.PilotLog;
import org.mdt.aioceaneye.service.PilotLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pilot_log")
public class PilotLogController {

    @Autowired
    private PilotLogService service;

    @PostMapping
    public ResponseEntity<PilotLog> create(@RequestBody PilotLogDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PilotLog>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PilotLog> getById(@PathVariable String id) {
        return service.findById(id)
                .map(p -> new ResponseEntity<>(p, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PilotLog> update(@PathVariable String id, @RequestBody PilotLogDto dto) {
        return service.update(id, dto)
                .map(updated -> new ResponseEntity<>(updated, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
