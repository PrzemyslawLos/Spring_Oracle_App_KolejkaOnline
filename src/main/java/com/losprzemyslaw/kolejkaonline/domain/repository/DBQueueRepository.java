package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.DTO.QueueCompanyDTO;
import com.losprzemyslaw.kolejkaonline.domain.Queue;

import javax.annotation.PostConstruct;
import java.sql.*;
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
    public void addQueue(Queue queue){
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
    public List<QueueCompanyDTO> getAllQueues(){

    }


    @Override
    public String toString() {
        return "QueueRepository{" +
                "queueMap="  +
                '}';
    }

}
