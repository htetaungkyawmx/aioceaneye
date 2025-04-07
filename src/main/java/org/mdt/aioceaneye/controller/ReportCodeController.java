package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.ReportCodeDto;
import org.mdt.aioceaneye.model.ReportCode;
import org.mdt.aioceaneye.service.ReportCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reportcode")
public class ReportCodeController {

    @Autowired
    private ReportCodeService service;

    @PostMapping
    public ResponseEntity<ReportCode> create(@RequestBody ReportCodeDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ReportCode>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<ReportCode> getById(@PathVariable String code) {
        return service.findById(code)
                .map(rc -> new ResponseEntity<>(rc, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{code}")
    public ResponseEntity<ReportCode> update(@PathVariable String code, @RequestBody ReportCodeDto dto) {
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
