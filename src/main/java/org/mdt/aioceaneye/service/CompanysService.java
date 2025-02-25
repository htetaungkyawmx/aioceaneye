package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.CompanysDTO;
import org.mdt.aioceaneye.model.Company;

import java.util.List;
import java.util.Optional;

public interface CompanysService {

    Company save(CompanysDTO companysDTO);

    Optional<Company> update(long coId, CompanysDTO companysDTO);

    List<Company> findAll();

    Optional<Company> findById(long coId);

    void delete(long coId);

}
