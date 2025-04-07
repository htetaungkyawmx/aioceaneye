package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.MaterialLogDto;
import org.mdt.aioceaneye.dto.MaterialLogKey;
import org.mdt.aioceaneye.model.MaterialLog;
import org.mdt.aioceaneye.service.MaterialLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/material-logs")
public class MaterialLogController {

    @Autowired
    private MaterialLogService service;

    @PostMapping
    public ResponseEntity<MaterialLog> create(@RequestBody MaterialLogDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<MaterialLog>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<MaterialLog> getById(@RequestParam Timestamp materialAt,
                                               @RequestParam String materialSerialno) {
        MaterialLogKey key = new MaterialLogKey(materialAt, materialSerialno);
        return service.findById(key)
                .map(log -> new ResponseEntity<>(log, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/id")
    public ResponseEntity<MaterialLog> update(@RequestParam Timestamp materialAt,
                                              @RequestParam String materialSerialno,
                                              @RequestBody MaterialLogDto dto) {
        MaterialLogKey key = new MaterialLogKey(materialAt, materialSerialno);
        return service.update(key, dto)
                .map(updated -> new ResponseEntity<>(updated, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> delete(@RequestParam Timestamp materialAt,
                                       @RequestParam String materialSerialno) {
        MaterialLogKey key = new MaterialLogKey(materialAt, materialSerialno);
        service.delete(key);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
