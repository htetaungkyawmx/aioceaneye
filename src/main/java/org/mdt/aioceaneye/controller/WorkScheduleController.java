package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.WorkScheduleDto;
import org.mdt.aioceaneye.model.WorkSchedule;
import org.mdt.aioceaneye.service.WorkScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workschedule")
public class WorkScheduleController {

    @Autowired
    private WorkScheduleService service;

    @PostMapping
    public ResponseEntity<WorkSchedule> create(@RequestBody WorkScheduleDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<WorkSchedule>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<WorkSchedule> getById(@PathVariable String code) {
        return service.findById(code)
                .map(ws -> new ResponseEntity<>(ws, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{code}")
    public ResponseEntity<WorkSchedule> update(@PathVariable String code, @RequestBody WorkScheduleDto dto) {
        return service.update(code, dto)
                .map(updated -> new ResponseEntity<>(updated, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<Void> delete(@PathVariable String code) {
        service.delete(code);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
