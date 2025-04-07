package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.ReportRequestDto;
import org.mdt.aioceaneye.model.ReportRequest;
import org.mdt.aioceaneye.service.ReportRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report-requests")
public class ReportRequestController {

    @Autowired
    private ReportRequestService service;

    @PostMapping
    public ResponseEntity<ReportRequest> create(@RequestBody ReportRequestDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ReportRequest>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReportRequest> getById(@PathVariable String id) {
        return service.findById(id)
                .map(data -> new ResponseEntity<>(data, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReportRequest> update(@PathVariable String id, @RequestBody ReportRequestDto dto) {
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
