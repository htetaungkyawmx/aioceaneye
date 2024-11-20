package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.CompanyDto;
import org.mdt.aioceaneye.model.Company;
import org.mdt.aioceaneye.repository.CompanyRepository;
import org.mdt.aioceaneye.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company save(CompanyDto companyDto) {
        Company company = Company
                .builder()
                .email(companyDto.getEmail())
                .password(companyDto.getPassword())
                .build();
        return companyRepository.save(company);
    }

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }
}
