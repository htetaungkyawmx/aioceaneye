package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.UserLogDto;
import org.mdt.aioceaneye.model.UserLog;
import org.mdt.aioceaneye.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-logs")
public class UserLogController {

    @Autowired
    private UserLogService service;

    @PostMapping
    public ResponseEntity<UserLog> create(@RequestBody UserLogDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserLog>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{email}")
    public ResponseEntity<UserLog> getById(@PathVariable String email) {
        return service.findById(email)
                .map(log -> new ResponseEntity<>(log, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{email}")
    public ResponseEntity<UserLog> update(@PathVariable String email, @RequestBody UserLogDto dto) {
        return service.update(email, dto)
                .map(updated -> new ResponseEntity<>(updated, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Void> delete(@PathVariable String email) {
        service.delete(email);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
