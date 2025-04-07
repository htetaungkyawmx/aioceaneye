package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.PostFlightLogDto;
import org.mdt.aioceaneye.model.PostFlightLog;
import org.mdt.aioceaneye.service.PostFlightLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postflight-logs")
public class PostFlightLogController {

    @Autowired
    private PostFlightLogService service;

    @PostMapping
    public ResponseEntity<PostFlightLog> create(@RequestBody PostFlightLogDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PostFlightLog>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostFlightLog> getById(@PathVariable String id) {
        return service.findById(id)
                .map(data -> new ResponseEntity<>(data, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostFlightLog> update(@PathVariable String id, @RequestBody PostFlightLogDto dto) {
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
