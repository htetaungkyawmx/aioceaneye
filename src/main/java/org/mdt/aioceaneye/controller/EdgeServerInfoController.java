package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.EdgeServerInfoDto;
import org.mdt.aioceaneye.model.EdgeServerInfo;
import org.mdt.aioceaneye.service.EdgeServerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/edgeserverinfo")
public class EdgeServerInfoController {

    @Autowired
    private EdgeServerInfoService service;

    @PostMapping
    public ResponseEntity<EdgeServerInfo> create(@RequestBody EdgeServerInfoDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EdgeServerInfo>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EdgeServerInfo> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(info -> new ResponseEntity<>(info, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EdgeServerInfo> update(@PathVariable Integer id, @RequestBody EdgeServerInfoDto dto) {
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
