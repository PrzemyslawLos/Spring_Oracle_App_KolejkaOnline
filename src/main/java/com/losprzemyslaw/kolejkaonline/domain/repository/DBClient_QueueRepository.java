package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.Client;
import com.losprzemyslaw.kolejkaonline.domain.Client_Queue;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBClient_QueueRepository {
   /* Statement st;
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
    public List<Client> getAllClientsInQueue() throws SQLException {
        con = DriverManager.getConnection(url, user, pass);
        st = con.createStatement();
        String sql = ("select cl.clientid, cl.login, cl.name, cq.c_number\n" +
                "from client cl\n" +
                "join client_queue cq on cl.clientid = cq.clientid\n" +
                "where cq.queueid = 21\n" +
                "order by cq.c_number;");
        rs = st.executeQuery(sql);
        List<Client_Queue> clientsInQueue = new ArrayList<>();
        int clientId, c_number;
        String clientId, login, name;

        while (rs.next()) {
            clientId = rs.getInt("clientId");
            login = rs.getString("login");
            name = rs.getString("name");
            c_number = rs.getInt("c_number");

            clientsInQueue.add(new Client_Queue(id, login, password, balance, email, name, surname));
        }

        return clients;

    }

    */
}
