package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.UserQuestionDto;
import org.mdt.aioceaneye.model.UserQuestion;
import org.mdt.aioceaneye.service.UserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userquestion")
public class UserQuestionController {

    @Autowired
    private UserQuestionService service;

    @PostMapping
    public ResponseEntity<UserQuestion> create(@RequestBody UserQuestionDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserQuestion>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserQuestion> getById(@PathVariable int id) {
        return service.findById(id)
                .map(qq -> new ResponseEntity<>(qq, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserQuestion> update(@PathVariable int id, @RequestBody UserQuestionDto dto) {
        return service.update(id, dto)
                .map(updated -> new ResponseEntity<>(updated, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
