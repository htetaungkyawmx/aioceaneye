package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.UserGradeDto;
import org.mdt.aioceaneye.model.UserGrade;
import org.mdt.aioceaneye.service.UserGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-grades")
public class UserGradeController {

    @Autowired
    private UserGradeService service;

    @PostMapping
    public ResponseEntity<UserGrade> create(@RequestBody UserGradeDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserGrade>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserGrade> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(grade -> new ResponseEntity<>(grade, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserGrade> update(@PathVariable Integer id, @RequestBody UserGradeDto dto) {
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
