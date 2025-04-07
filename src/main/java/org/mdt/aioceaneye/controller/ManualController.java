package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.ManualDto;
import org.mdt.aioceaneye.model.Manual;
import org.mdt.aioceaneye.service.ManualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manuals")
public class ManualController {

    @Autowired
    private ManualService service;

    @PostMapping
    public ResponseEntity<Manual> create(@RequestBody ManualDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Manual>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manual> getById(@PathVariable int id) {
        return service.findById(id)
                .map(m -> new ResponseEntity<>(m, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
