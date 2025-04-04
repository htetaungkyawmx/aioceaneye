package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.CompanysDto;
import org.mdt.aioceaneye.model.Companys;

import java.util.List;
import java.util.Optional;

public interface CompanysService {
    Companys save(CompanysDto companyDto);

    Optional<Companys> update(int id, CompanysDto companyDto);

    List<Companys> findAll();

    Optional<Companys> findById(int id);

    void delete(int id);
}
