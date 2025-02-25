package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.CompanysDTO;
import org.mdt.aioceaneye.model.Companys;

import java.util.List;
import java.util.Optional;

public interface CompanysService {

    Companys save(CompanysDTO companysDTO);

    Optional<Companys> update(long coId, CompanysDTO companysDTO);

    List<Companys> findAll();

    Optional<Companys> findById(long coId);

    void delete(long coId);
}
