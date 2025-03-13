package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.company.CompanyDto;
import org.mdt.aioceaneye.dto.company.CompanyInfo;
import org.mdt.aioceaneye.model.Company;
import org.mdt.aioceaneye.repository.CompanyRepo;
import org.mdt.aioceaneye.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepo companyRepo;

    @Override
    public ResponseEntity<String> registerCompany(CompanyDto form) {
        Company company = CompanyDto.toEntity(form);
        companyRepo.save(company);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Company: " + company.getCoName() + "  saved successfully");
    }

    @Override
    public ResponseEntity<String> updateCompany(int coId, CompanyDto form) {
        if(!companyRepo.existsById(coId)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Company with id: "+ coId+ " is not found");
        }
        var company = companyRepo.findById(coId).get();
        company.setCoName(form.coName());
        company.setCoRegisterNo(form.coRegisterNo());
        company.setCoRegisterFile(form.coRegisterFile());
        company.setCoCeoName(form.coCeoName());
        company.setCoEmployees(form.coEmployees());
        company.setCoTel(form.coTel());
        company.setCoFax(form.coFax());
        company.setCoAddress(form.coAddress());
        company.setCoUserEmail(form.coUserEmail());
        company.setCoUserPhone(form.coUserPhone());
        company.setCoCountry(form.coCountry());
        company.setCoLogo(form.coLogo());
        company.setEstablished_year(form.established_year());
        companyRepo.save(company);
        return ResponseEntity.status(HttpStatus.OK)
                .body("Company: " + company.getCoName() + "  updated successfully");
    }

    @Override
    public List<CompanyInfo> getAllCompanyInfos() {
        return companyRepo.findAllCompanyInfos();
    }

    @Override
    public CompanyDto getCompanyDtoById(int id) {
        return companyRepo.findById(id).map(CompanyDto::toDto).orElse(null);
    }

    @Override
    public ResponseEntity<String> deleteCompany(int coId) {
        if(companyRepo.existsById(coId)) {
            companyRepo.deleteById(coId);
            return ResponseEntity.status(HttpStatus.OK).body("Company: " + coId + " deleted successfully");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Company with id: "+ coId+ " is not found");
    }


}
