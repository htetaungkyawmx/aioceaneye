package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.ReportDto;
import org.mdt.aioceaneye.model.Report;
import org.mdt.aioceaneye.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService service;

    @PostMapping
    public ResponseEntity<Report> create(@RequestBody ReportDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Report>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{docNo}")
    public ResponseEntity<Report> getById(@PathVariable String docNo) {
        return service.findById(docNo)
                .map(r -> new ResponseEntity<>(r, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{docNo}")
    public ResponseEntity<Report> update(@PathVariable String docNo, @RequestBody ReportDto dto) {
        return service.update(docNo, dto)
                .map(updated -> new ResponseEntity<>(updated, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{docNo}")
    public ResponseEntity<Void> delete(@PathVariable String docNo) {
        service.delete(docNo);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
