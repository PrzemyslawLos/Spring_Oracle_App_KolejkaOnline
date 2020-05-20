package com.losprzemyslaw.kolejkaonline.controllers;

import com.losprzemyslaw.kolejkaonline.domain.Company;
import com.losprzemyslaw.kolejkaonline.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;
import java.util.List;

@Controller
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @RequestMapping("/companies")
    public String getCompanies(Model model) throws SQLException {
        List<Company> allCompanies = companyService.getAllCompanies();
        model.addAttribute("companies", allCompanies);
        return "companies";
    }

    @RequestMapping("/newcompany")
    public String addCompany(Model model) throws SQLException {
        model.addAttribute("company", new Company());
        return "companyform";
    }

    @RequestMapping(value = "/companies", method = RequestMethod.POST)
    public String saveCompany(Company company) throws SQLException, ClassNotFoundException {
        companyService.addCompany(company);
        return "redirect:/companies";
    }

}
