package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.DTO.QueueCompanyDTO;
import com.losprzemyslaw.kolejkaonline.domain.Queue;

import javax.annotation.PostConstruct;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DBQueueRepository implements QueueRepository {
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
    public void addQueue(Queue queue) throws SQLException{
        con = DriverManager.getConnection(url, user, pass);
        st = con.createStatement();
        String sql = ("insert into queue(companyid, maxsize, numberofwplaces, currentnumber)" + "values (" + queue.getCompanyid() + ","
                +  queue.getMaxSize() + ","  + queue.getNumberOfPlaces() + "," + queue.getCurrentNumber() +  ")");
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
    public List<QueueCompanyDTO> getAllQueues() throws SQLException{
        con = DriverManager.getConnection(url, user, pass);
        st = con.createStatement();
        String sql = ("select co.companyname,co.description, co.adress, co.city, co.postcode, qu.numberofwplaces from company co join queue qu on co.companyid = qu.companyid");
        rs = st.executeQuery(sql);
        List<QueueCompanyDTO> allQueues = new ArrayList<>();
        System.out.println(sql);

        while (rs.next()) {
            String description = rs.getString("description");
            System.out.println("Opis" + description);
            String companyName = rs.getString("companyname");
            String adress = rs.getString("adress");
            String city = rs.getString("city");
            String postcode = rs.getString("postcode");
            int numberOfPlaces = rs.getInt("numberofwplaces");

            allQueues.add(new QueueCompanyDTO(description, companyName, adress, city, postcode, numberOfPlaces));
        }

        return allQueues;

    }


    @Override
    public String toString() {
        return "QueueRepository{" +
                "queueMap="  +
                '}';
    }

}
