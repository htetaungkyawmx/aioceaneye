package org.mdt.aioceaneye.dto.company;

import org.mdt.aioceaneye.model.Company;

public record CompanyInfo(
        String coName,
        String coLogo,
        String coRegisterNo,
        String coCountry,
        String coCeoName,
        String coTel
) {

    public static CompanyInfo toDto(Company company) {
        return new CompanyInfo(
                company.getCoName(),
                company.getCoLogo(),
                company.getCoRegisterNo(),
                company.getCoCountry(),
                company.getCoCeoName(),
                company.getCoTel()
        );
    }
}
