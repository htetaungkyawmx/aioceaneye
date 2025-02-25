package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.CompanysDTO;
import org.mdt.aioceaneye.model.Company;
import org.mdt.aioceaneye.service.CompanysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companys")
public class CompanysController {

    @Autowired
    private CompanysService companysService;

    @PostMapping
    public ResponseEntity<Company> create(@RequestBody CompanysDTO companysDTO) {
        Company createdCompany = companysService.save(companysDTO);
        return new ResponseEntity<>(createdCompany, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAll() {
        List<Company> companies = companysService.findAll();
        return new ResponseEntity<>(companies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> getById(@PathVariable long id) { // Fixed int to long
        return companysService.findById(id)
                .map(company -> new ResponseEntity<>(company, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> update(@PathVariable long id, @RequestBody CompanysDTO companysDTO) {
        return companysService.update(id, companysDTO)
                .map(updatedCompany -> new ResponseEntity<>(updatedCompany, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        if (companysService.findById(id).isPresent()) { // Check if exists before deleting
            companysService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
