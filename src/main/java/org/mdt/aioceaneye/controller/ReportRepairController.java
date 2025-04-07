package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.ReportRepairDto;
import org.mdt.aioceaneye.model.ReportRepair;
import org.mdt.aioceaneye.service.ReportRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report-repairs")
public class ReportRepairController {

    @Autowired
    private ReportRepairService service;

    @PostMapping
    public ResponseEntity<ReportRepair> create(@RequestBody ReportRepairDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ReportRepair>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReportRepair> getById(@PathVariable String id) {
        return service.findById(id)
                .map(report -> new ResponseEntity<>(report, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReportRepair> update(@PathVariable String id, @RequestBody ReportRepairDto dto) {
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
