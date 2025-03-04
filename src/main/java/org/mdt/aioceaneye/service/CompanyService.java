package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.company.CompanyDto;
import org.mdt.aioceaneye.dto.company.CompanyInfo;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CompanyService {

    ResponseEntity<String> registerCompany(CompanyDto form);

    ResponseEntity<String> updateCompany(int coId, CompanyDto form);

    List<CompanyInfo> getAllCompanyInfos();

    CompanyDto getCompanyDtoById(int coId);

    ResponseEntity<String> deleteCompany(int coId);
}




