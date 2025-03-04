package org.mdt.aioceaneye.dto.company;

import org.mdt.aioceaneye.model.Company;

import java.sql.Date;

public record CompanyDto(
        String coName,
        String coRegisterNo,
        String coRegisterFile,
        String coCountry,
        String coHomePage,
        Date established_year,
        Integer coEmployees,
        String coAddress,
        String coTel,
        String coFax,
        String coCeoName,
        String coUserEmail,
        String coUserPhone,
        String coLogo

) {
    public static Company toEntity(CompanyDto form) {
        return Company.builder()
                .coName(form.coName)
                .coRegisterNo(form.coRegisterNo)
                .coRegisterFile(form.coRegisterFile)
                .coCountry(form.coCountry)
                .coHomePage(form.coHomePage)
                .established_year(form.established_year)
                .coEmployees(form.coEmployees)
                .coAddress(form.coAddress)
                .coTel(form.coTel)
                .coFax(form.coFax)
                .coCeoName(form.coCeoName)
                .coUserEmail(form.coUserEmail)
                .coUserPhone(form.coUserPhone)
                .coLogo(form.coLogo)
                .build();
    }

    public static CompanyDto toDto(Company company) {
        return new CompanyDto(
                company.getCoName(),
                company.getCoRegisterNo(),
                company.getCoRegisterFile(),
                company.getCoCountry(),
                company.getCoHomePage(),
                company.getEstablished_year(),
                company.getCoEmployees(),
                company.getCoAddress(),
                company.getCoTel(),
                company.getCoFax(),
                company.getCoCeoName(),
                company.getCoUserEmail(),
                company.getCoUserPhone(),
                company.getCoLogo()
        );
    }
}
