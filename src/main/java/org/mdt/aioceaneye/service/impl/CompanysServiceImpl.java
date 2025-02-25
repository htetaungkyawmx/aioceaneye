package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.CompanysDTO;
import org.mdt.aioceaneye.model.Companys;
import org.mdt.aioceaneye.repository.CompanysRepo;
import org.mdt.aioceaneye.service.CompanysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanysServiceImpl implements CompanysService {

    @Autowired
    private CompanysRepo companysRepo;

    @Override
    public Companys save(CompanysDTO companysDTO) {
        Companys companys = Companys.builder()
                .coName(companysDTO.getCoName())
                .coCeoName(companysDTO.getCoCeoName())
                .coRegisterNo(companysDTO.getCoRegisterNo())
                .coTel(companysDTO.getCoTel())
                .coFax(companysDTO.getCoFax())
                .coAddress(companysDTO.getCoAddress())
                .coUserName(companysDTO.getCoUserName())
                .coUserEmail(companysDTO.getCoUserEmail())
                .coUserPhone(companysDTO.getCoUserPhone())
                .coCountry(companysDTO.getCoCountry())
                .coLogo(companysDTO.getCoLogo())
                .coRegisterFile(companysDTO.getCoRegisterFile())
                .established_year(companysDTO.getEstablished_year())
                .build();
        return companysRepo.save(companys);
    }

    @Override
    public Optional<Companys> update(long coId, CompanysDTO companysDTO) {
        return companysRepo.findById(coId).map(existingCompany -> {
            existingCompany.setCoName(companysDTO.getCoName());
            existingCompany.setCoCeoName(companysDTO.getCoCeoName());
            existingCompany.setCoRegisterNo(companysDTO.getCoRegisterNo());
            existingCompany.setCoTel(companysDTO.getCoTel());
            existingCompany.setCoFax(companysDTO.getCoFax());
            existingCompany.setCoAddress(companysDTO.getCoAddress());
            existingCompany.setCoUserName(companysDTO.getCoUserName());
            existingCompany.setCoUserEmail(companysDTO.getCoUserEmail());
            existingCompany.setCoUserPhone(companysDTO.getCoUserPhone());
            existingCompany.setCoCountry(companysDTO.getCoCountry());
            existingCompany.setCoLogo(companysDTO.getCoLogo());
            existingCompany.setCoRegisterFile(companysDTO.getCoRegisterFile());
            existingCompany.setEstablished_year(companysDTO.getEstablished_year());
            return companysRepo.save(existingCompany);
        });
    }

    @Override
    public List<Companys> findAll() {
        return companysRepo.findAll();
    }

    @Override
    public Optional<Companys> findById(long coId) {
        return companysRepo.findById(coId);
    }

    @Override
    public void delete(long coId) {
        if (companysRepo.existsById(coId)) {
            companysRepo.deleteById(coId);
        }
    }
}
