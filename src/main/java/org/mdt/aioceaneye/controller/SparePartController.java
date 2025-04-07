package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.SparePartDto;
import org.mdt.aioceaneye.model.SparePart;
import org.mdt.aioceaneye.service.SparePartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sparepart")
public class SparePartController {

    @Autowired
    private SparePartService service;

    @PostMapping
    public ResponseEntity<SparePart> create(@RequestBody SparePartDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<SparePart>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SparePart> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(part -> new ResponseEntity<>(part, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SparePart> update(@PathVariable Integer id, @RequestBody SparePartDto dto) {
        return service.update(id, dto)
                .map(updated -> new ResponseEntity<>(updated, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
