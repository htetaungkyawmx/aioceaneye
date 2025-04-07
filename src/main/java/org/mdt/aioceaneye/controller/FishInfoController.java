package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.FishInfoDto;
import org.mdt.aioceaneye.model.FishInfo;
import org.mdt.aioceaneye.service.FishInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fish-info")
public class FishInfoController {

    @Autowired
    private FishInfoService service;

    @PostMapping
    public ResponseEntity<FishInfo> create(@RequestBody FishInfoDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<FishInfo>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FishInfo> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(data -> new ResponseEntity<>(data, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FishInfo> update(@PathVariable Integer id, @RequestBody FishInfoDto dto) {
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
