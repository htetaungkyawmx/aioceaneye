package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.CompanyDTO;
import org.mdt.aioceaneye.model.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {

    Company save(CompanyDTO companyDTO);

    Optional<Company> update(long coId, CompanyDTO companyDTO);

    List<Company> findAll();

    Optional<Company> findById(long coId);

    void delete(long coId);
}




