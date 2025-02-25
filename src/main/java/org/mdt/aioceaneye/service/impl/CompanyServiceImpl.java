package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.CompanyDTO;
import org.mdt.aioceaneye.model.Company;
import org.mdt.aioceaneye.repository.CompanyRepo;
import org.mdt.aioceaneye.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepo companyRepo;

    @Override
    public Company save(CompanyDTO companyDTO) {
        Company company = Company.builder()
                .coName(companyDTO.getCoName())
                .coCeoName(companyDTO.getCoCeoName())
                .coRegisterNo(companyDTO.getCoRegisterNo())
                .coTel(companyDTO.getCoTel())
                .coFax(companyDTO.getCoFax())
                .coAddress(companyDTO.getCoAddress())
                .coUserName(companyDTO.getCoUserName())
                .coUserEmail(companyDTO.getCoUserEmail())
                .coUserPhone(companyDTO.getCoUserPhone())
                .coCountry(companyDTO.getCoCountry())
                .coLogo(companyDTO.getCoLogo())
                .coRegisterFile(companyDTO.getCoRegisterFile())
                .established_year(companyDTO.getEstablished_year())
                .build();
        return companyRepo.save(company);
    }

    @Override
    public Optional<Company> update(long coId, CompanyDTO companyDTO) {
        return companyRepo.findById(coId).map(existingCompany -> {
            existingCompany.setCoName(companyDTO.getCoName());
            existingCompany.setCoCeoName(companyDTO.getCoCeoName());
            existingCompany.setCoRegisterNo(companyDTO.getCoRegisterNo());
            existingCompany.setCoTel(companyDTO.getCoTel());
            existingCompany.setCoFax(companyDTO.getCoFax());
            existingCompany.setCoAddress(companyDTO.getCoAddress());
            existingCompany.setCoUserName(companyDTO.getCoUserName());
            existingCompany.setCoUserEmail(companyDTO.getCoUserEmail());
            existingCompany.setCoUserPhone(companyDTO.getCoUserPhone());
            existingCompany.setCoCountry(companyDTO.getCoCountry());
            existingCompany.setCoLogo(companyDTO.getCoLogo());
            existingCompany.setCoRegisterFile(companyDTO.getCoRegisterFile());
            existingCompany.setEstablished_year(companyDTO.getEstablished_year());
            return companyRepo.save(existingCompany);
        });
    }

    @Override
    public List<Company> findAll() {
        return companyRepo.findAll();
    }

    @Override
    public Optional<Company> findById(long coId) {
        return companyRepo.findById(coId);
    }

    @Override
    public void delete(long coId) {
        if (companyRepo.existsById(coId)) {
            companyRepo.deleteById(coId);
        }
    }
}
