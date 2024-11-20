package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.CompanyDto;
import org.mdt.aioceaneye.model.Company;

import java.util.List;

public interface CompanyService {
    Company save(CompanyDto companyDto);
    List<Company> findAll();

}
