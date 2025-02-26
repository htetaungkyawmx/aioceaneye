package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.company.CompanyDto;
import org.mdt.aioceaneye.dto.company.CompanyInfo;
import org.mdt.aioceaneye.model.Company;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CompanyService {

    ResponseEntity<String> register(CompanyDto form);

    ResponseEntity<String> update(long coId, CompanyDto form);

    List<CompanyInfo> getAllCompanyInfos();

    CompanyDto getCompanyDtoById(long id);

    ResponseEntity<String> delete(long coId);
}
