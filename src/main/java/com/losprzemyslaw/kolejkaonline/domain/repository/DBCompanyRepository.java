package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.Client;
import com.losprzemyslaw.kolejkaonline.domain.Company;
import com.losprzemyslaw.kolejkaonline.domain.Queue;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DBCompanyRepository implements CompanyRepository {
    Statement st;
    ResultSet rs;
    Connection con;

    String url = "jdbc:oracle:thin:@localhost:1521:orclMoto";
    String user = "UZYTKOWNIK";
    String pass = "UZYTKOWNIK";

    public void connect(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //Driver myDriver = new oracle.jdbc.driver.OracleDriver();
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
    }

    @Override
    public void addCompany(Company company) throws SQLException{
        con = DriverManager.getConnection(url,user,pass);
        st = con.createStatement();
        String sql = ("insert into COMPANY(login, password, description, companyname, adress, city, postcode)" + "values (" + "'" + company.getLogin() + "',"
                + "'" + company.getPassword() + "'," + "'" + company.getDescription()  + "'," + "'" + company.getCompanyName() + "'," + "'" + company.getAdress() + "'," + "'" + company.getCity()  + "'," + "'" + company.getPostcode() + "')") ;
        System.out.println(sql);
        rs = st.executeQuery(sql);
        rs = st.executeQuery("commit");

    }

    @Override
    public void removeQueue(String companyName){

    }

    @Override
    public Queue getQueue(String companyName){
        return null;
    }

    @Override
    public List<Company> getAllCompanies() throws SQLException{
        con = DriverManager.getConnection(url, user, pass);
        st = con.createStatement();
        String sql = ("Select COMPANYID,LOGIN,PASSWORD,DESCRIPTION,COMPANYNAME,ADRESS,CITY,POSTCODE FROM COMPANY order by COMPANYID ASC") ;
        rs = st.executeQuery(sql);
        List<Company> companies = new ArrayList<>();
        int companyId;
        String login, password, description, companyname, adress, city, postcode;

        while(rs.next())
        {
            companyId = rs.getInt("companyid");
            login = rs.getString("login");
            password = rs.getString("password");
            description = rs.getString("description");
            companyname = rs.getString("companyname");
            adress = rs.getString("adress");
            city = rs.getString("city");
            postcode = rs.getString("postcode");

            companies.add(new Company(companyId,login,password, description, companyname, adress, city, postcode));
        }

        return companies;
    }


    @Override
    public String toString() {
        return "QueueRepository{" +
                "queueMap="  +
                '}';
    }
}
