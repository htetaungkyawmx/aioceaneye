package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.company.CompanyDto;
import org.mdt.aioceaneye.dto.company.CompanyInfo;
import org.mdt.aioceaneye.model.Company;
import org.mdt.aioceaneye.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mdt/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public ResponseEntity<String> registerCompany(@RequestBody CompanyDto form) {
       return companyService.register(form);
    }

    @GetMapping
    public List<CompanyInfo> getAllCompanyInfos() {
        return companyService.getAllCompanyInfos();
    }

    @GetMapping("/{id}")
    public CompanyDto getById(@PathVariable long id) { // Fixed int to long
        return companyService.getCompanyDtoById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable long id, @RequestBody CompanyDto form) {
       return companyService.update(id, form);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        return companyService.delete(id);
    }
}
