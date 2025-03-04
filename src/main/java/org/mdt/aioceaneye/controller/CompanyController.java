package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.company.CompanyDto;
import org.mdt.aioceaneye.dto.company.CompanyInfo;
import org.mdt.aioceaneye.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aioceaneye/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public ResponseEntity<String> registerCompany(@RequestBody CompanyDto form) {
       return companyService.registerCompany(form);
    }

    @GetMapping
    public List<CompanyInfo> getAllCompanyInfos() {
        return companyService.getAllCompanyInfos();
    }

    @GetMapping("/{id}")
    public CompanyDto getById(@PathVariable int id) {
        return companyService.getCompanyDtoById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody CompanyDto form) {
       return companyService.updateCompany(id, form);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return companyService.deleteCompany(id);
    }
}
