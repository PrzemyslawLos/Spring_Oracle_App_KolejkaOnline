package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.Company;
import com.losprzemyslaw.kolejkaonline.domain.Queue;

import java.sql.SQLException;
import java.util.List;

public interface CompanyRepository {
    void addCompany(Company company) throws SQLException;

    void removeQueue(String companyName);

    Queue getQueue(String companyName);

    List<Company> getAllCompanies() throws  SQLException;

    @Override
    String toString();
}
