package com.losprzemyslaw.kolejkaonline.services;

import com.losprzemyslaw.kolejkaonline.domain.Company;
import com.losprzemyslaw.kolejkaonline.domain.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public void addCompany(Company company) throws SQLException, ClassNotFoundException {
        companyRepository.addCompany(company);
    }

    public List<Company> getAllCompanies() throws SQLException {
        return new ArrayList<>(companyRepository.getAllCompanies());
    }
}
