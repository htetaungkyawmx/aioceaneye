package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.FrequentQuestionDto;
import org.mdt.aioceaneye.model.FrequentQuestion;
import org.mdt.aioceaneye.service.FrequentQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/frequentquestion")
public class FrequentQuestionController {

    @Autowired
    private FrequentQuestionService service;

    @PostMapping
    public ResponseEntity<FrequentQuestion> create(@RequestBody FrequentQuestionDto dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<FrequentQuestion>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FrequentQuestion> getById(@PathVariable int id) {
        return service.findById(id)
                .map(fq -> new ResponseEntity<>(fq, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FrequentQuestion> update(@PathVariable int id, @RequestBody FrequentQuestionDto dto) {
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

