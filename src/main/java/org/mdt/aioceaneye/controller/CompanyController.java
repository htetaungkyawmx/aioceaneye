package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.CompanyDto;
import org.mdt.aioceaneye.model.Company;
import org.mdt.aioceaneye.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("org/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/create")
    public ResponseEntity<Company> create(@RequestBody CompanyDto companyDto) {
        Company createCompany = companyService.save(companyDto);
        return new ResponseEntity<>(createCompany, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Company>> getAll() {
        List<Company> companies = companyService.findAll();
        return new ResponseEntity<>(companies, HttpStatus.OK);
    }

}
