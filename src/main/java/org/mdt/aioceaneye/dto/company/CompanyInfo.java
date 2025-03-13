package org.mdt.aioceaneye.dto.company;

import org.mdt.aioceaneye.model.Company;

public record CompanyInfo(
        int coId,
        String coName,
        String coLogo,
        String coRegisterNo,
        String coCountry,
        String coCeoName,
        String coTel
) {

    public static CompanyInfo toDto(Company company) {
        return new CompanyInfo(
                company.getCoId(),
                company.getCoName(),
                company.getCoLogo(),
                company.getCoRegisterNo(),
                company.getCoCountry(),
                company.getCoCeoName(),
                company.getCoTel()
        );
    }
}
