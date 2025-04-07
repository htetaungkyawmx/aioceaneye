package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.EdgeServerLogDto;
import org.mdt.aioceaneye.dto.EdgeServerLogKey;
import org.mdt.aioceaneye.model.EdgeServerLog;
import org.mdt.aioceaneye.service.EdgeServerLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/edgeserverlog")
public class EdgeServerLogController {

    @Autowired
    private EdgeServerLogService service;

    @PostMapping
    public ResponseEntity<EdgeServerLog> create(@RequestBody EdgeServerLogDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EdgeServerLog>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<EdgeServerLog> getById(@RequestParam Timestamp coneectAt,
                                                 @RequestParam String edgeserverIp) {
        EdgeServerLogKey key = new EdgeServerLogKey(coneectAt, edgeserverIp);
        return service.findById(key)
                .map(log -> new ResponseEntity<>(log, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/id")
    public ResponseEntity<EdgeServerLog> update(@RequestParam Timestamp coneectAt,
                                                @RequestParam String edgeserverIp,
                                                @RequestBody EdgeServerLogDto dto) {
        EdgeServerLogKey key = new EdgeServerLogKey(coneectAt, edgeserverIp);
        return service.update(key, dto)
                .map(updated -> new ResponseEntity<>(updated, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> delete(@RequestParam Timestamp coneectAt,
                                       @RequestParam String edgeserverIp) {
        EdgeServerLogKey key = new EdgeServerLogKey(coneectAt, edgeserverIp);
        service.delete(key);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
