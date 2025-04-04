package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.CompanysDto;
import org.mdt.aioceaneye.model.Companys;
import org.mdt.aioceaneye.service.CompanysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CompanysController {

    @Autowired
    private CompanysService companysService;

    @PostMapping
    public ResponseEntity<Companys> create(@RequestBody CompanysDto companysDto){
        Companys createdCompanys =companysService.save(companysDto);
        return new ResponseEntity<>(createdCompanys, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Companys>> getAll() {
        List<Companys> companies = companysService.findAll();
        return new ResponseEntity<>(companies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Companys> getById(@PathVariable int id) {
        return companysService.findById(id)
                .map(company -> new ResponseEntity<>(company, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Companys> update(@PathVariable int id, @RequestBody CompanysDto companyDto) {
        return companysService.update(id, companyDto)
                .map(updatedCompany -> new ResponseEntity<>(updatedCompany, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        companysService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
