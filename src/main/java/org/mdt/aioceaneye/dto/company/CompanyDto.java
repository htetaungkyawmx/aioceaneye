package org.mdt.aioceaneye.dto.company;

import org.mdt.aioceaneye.model.Company;

import java.sql.Date;

public record CompanyDto(
        String coName,
        String coRegisterNo,
        String coRegisterFile,
        String coCeoName,
        Integer coEmployees,
        String coTel,
        String coFax,
        String coAddress,
        String coUserName,
        String coUserEmail,
        String coUserPhone,
        String coCountry,
        String coLogo,
        Date established_year
) {
    public static Company toEntity(CompanyDto form) {
        return Company.builder()
                .coName(form.coName)
                .coRegisterNo(form.coRegisterNo)
                .coRegisterFile(form.coRegisterFile)
                .coCeoName(form.coCeoName)
                .coEmployees(form.coEmployees)
                .coTel(form.coTel)
                .coFax(form.coFax)
                .coAddress(form.coAddress)
                .coUserName(form.coUserName)
                .coUserEmail(form.coUserEmail)
                .coUserPhone(form.coUserPhone)
                .coCountry(form.coCountry)
                .coLogo(form.coLogo)
                .established_year(form.established_year)
                .build();
    }

    public static CompanyDto toDto(Company company) {
        return new CompanyDto(
                company.getCoName(),
                company.getCoRegisterNo(),
                company.getCoRegisterFile(),
                company.getCoCeoName(),
                company.getCoEmployees(),
                company.getCoTel(),
                company.getCoFax(),
                company.getCoAddress(),
                company.getCoUserName(),
                company.getCoUserEmail(),
                company.getCoUserPhone(),
                company.getCoCountry(),
                company.getCoLogo(),
                company.getEstablished_year()
        );
    }
}
