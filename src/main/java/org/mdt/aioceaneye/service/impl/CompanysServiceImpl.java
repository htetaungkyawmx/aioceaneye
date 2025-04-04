package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.CompanysDto;
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
    private CompanysRepo  companysRepo;

    @Override
    public Companys save(CompanysDto companyDto) {
        Companys companys = Companys.builder()
                .co_name(companyDto.getCo_name())
                .co_ceoname(companyDto.getCo_ceoname())
                .co_registerno(companyDto.getCo_registerno())
                .co_tel(companyDto.getCo_tel())
                .co_fax(companyDto.getCo_fax())
                .co_address(companyDto.getCo_address())
                .co_username(companyDto.getCo_username())
                .co_useremail(companyDto.getCo_useremail())
                .co_userphone(companyDto.getCo_userphone())
                .co_logo(companyDto.getCo_logo())
                .co_registerfile(companyDto.getCo_registerfile())
                .created_at(companyDto.getCreated_at())
                .created_user(companyDto.getCreated_user())
                .modified_at(companyDto.getModified_at())
                .modified_user(companyDto.getModified_user())
                .build();
        return companysRepo.save(companys);
    }

    @Override
    public Optional<Companys> update(int id, CompanysDto companyDto) {
        return companysRepo.findById(id).map(existingCompanys -> {
            existingCompanys.setCo_name(companyDto.getCo_name());
            existingCompanys.setCo_ceoname(companyDto.getCo_ceoname());
            existingCompanys.setCo_registerno(companyDto.getCo_registerno());
            existingCompanys.setCo_tel(companyDto.getCo_tel());
            existingCompanys.setCo_fax(companyDto.getCo_fax());
            existingCompanys.setCo_address(companyDto.getCo_address());
            existingCompanys.setCo_username(companyDto.getCo_username());
            existingCompanys.setCo_useremail(companyDto.getCo_useremail());
            existingCompanys.setCo_userphone(companyDto.getCo_userphone());
            existingCompanys.setCo_logo(companyDto.getCo_logo());
            existingCompanys.setCo_registerfile(companyDto.getCo_registerfile());
            existingCompanys.setCreated_at(companyDto.getCreated_at());
            existingCompanys.setModified_at(companyDto.getModified_at());
            existingCompanys.setModified_user(companyDto.getModified_user());
            return companysRepo.save(existingCompanys);
        });
    }

    @Override
    public List<Companys> findAll() {
        return companysRepo.findAll();
    }

    @Override
    public Optional<Companys> findById(int id) {
        return companysRepo.findById(id);
    }

    @Override
    public void delete(int id) {
        companysRepo.deleteById(id);
    }
}
