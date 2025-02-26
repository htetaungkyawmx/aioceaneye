package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.dto.company.CompanyDto;
import org.mdt.aioceaneye.dto.company.CompanyInfo;
import org.mdt.aioceaneye.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Long> {

    @Query("""
    select new org.mdt.aioceaneye.dto.company.CompanyInfo(c.coName, c.coLogo, c.coRegisterNo, c.coCountry, c.coCeoName, c.coTel) from Company c
""")
    List<CompanyInfo> findAllCompanyInfos();

}
