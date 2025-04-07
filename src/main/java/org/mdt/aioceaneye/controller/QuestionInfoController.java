package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.QuestionInfoDto;
import org.mdt.aioceaneye.model.QuestionInfo;
import org.mdt.aioceaneye.service.QuestionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionInfoController {

    @Autowired
    private QuestionInfoService service;

    @PostMapping
    public ResponseEntity<QuestionInfo> create(@RequestBody QuestionInfoDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<QuestionInfo>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<QuestionInfo> getById(@PathVariable int code) {
        return service.findById(code)
                .map(q -> new ResponseEntity<>(q, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{code}")
    public ResponseEntity<QuestionInfo> update(@PathVariable int code, @RequestBody QuestionInfoDto dto) {
        return service.update(code, dto)
                .map(updated -> new ResponseEntity<>(updated, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code) {
        service.delete(code);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
