package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.PilotWorkScheduleDto;
import org.mdt.aioceaneye.model.PilotWorkSchedule;
import org.mdt.aioceaneye.service.PilotWorkScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pilotwork")
public class PilotWorkScheduleController {

    @Autowired
    private PilotWorkScheduleService service;

    @PostMapping
    public ResponseEntity<PilotWorkSchedule> create(@RequestBody PilotWorkScheduleDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PilotWorkSchedule>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PilotWorkSchedule> getById(@PathVariable String id) {
        return service.findById(id)
                .map(p -> new ResponseEntity<>(p, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PilotWorkSchedule> update(@PathVariable String id, @RequestBody PilotWorkScheduleDto dto) {
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
