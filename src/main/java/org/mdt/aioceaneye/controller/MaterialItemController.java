package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.MaterialItemDto;
import org.mdt.aioceaneye.model.MaterialItem;
import org.mdt.aioceaneye.service.MaterialItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materialitem")
public class MaterialItemController {

    @Autowired
    private MaterialItemService service;

    @PostMapping
    public ResponseEntity<MaterialItem> create(@RequestBody MaterialItemDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<MaterialItem>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MaterialItem> getById(@PathVariable String id) {
        return service.findById(id)
                .map(i -> new ResponseEntity<>(i, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MaterialItem> update(@PathVariable String id, @RequestBody MaterialItemDto dto) {
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
