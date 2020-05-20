package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.Client;
import java.util.Collection;
import java.sql.*;
import java.util.*;
import oracle.jdbc.driver.OracleDriver;

public class DBClientRepository implements ClientRepository {


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
    public void addClient(Client client) throws SQLException,ClassNotFoundException {
        con = DriverManager.getConnection(url,user,pass);
        st = con.createStatement();
        String sql = ("insert into CLIENT(login, password, balance, email, name, surname)" + "values (" + "'" + client.getLogin() + "',"
                + "'" + client.getPassword() + "'," +  + client.getBalance() + "," + "'" + client.getEmail() + "'," + "'" +
                client.getName() + "'," + "'" + client.getSurname() + "')");
        System.out.println(sql);
        rs = st.executeQuery(sql);
        rs = st.executeQuery("commit");
    }


    @Override
    public void removeClient(String login) throws SQLException{
        con = DriverManager.getConnection(url,user,pass);
        st = con.createStatement();
        String sql = ("delete from CLIENT where login = '" + login + "'");
        System.out.println(sql);
        rs = st.executeQuery(sql);
        rs = st.executeQuery("commit");
    }
    @Override
    public List<Client> getAllClients() throws  SQLException{
        con = DriverManager.getConnection(url, user, pass);
        st = con.createStatement();
        String sql = ("Select CLIENTID,LOGIN,PASSWORD,EMAIL,NAME,SURNAME,BALANCE FROM CLIENT order by CLIENTID ASC") ;
        rs = st.executeQuery(sql);
        List <Client> clients = new ArrayList<>();
        int id;
        String login,password,email,name,surname;
        double balance;

        while(rs.next())
        {
            id = rs.getInt("clientid");
            login = rs.getString("login");
            password = rs.getString("password");
            email = rs.getString("email");
            name = rs.getString("name");
            surname= rs.getString("surname");
            balance = rs.getDouble("Balance");


            clients.add( new Client(id, login, password, balance, email, name, surname));
        }

        return clients;

    }

    @Override
    public Client getClient(String login){
       /* Client client;
        con = DriverManager.getConnection(url,user,pass);
        st = con.createStatement();
        String sql = ("delete from CLIENT where login = '" + login + "'");
        System.out.println(sql);
        rs = st.executeQuery(sql);
        rs = st.executeQuery("commit"); */
       return  null;

    }

    @Override
    public String toString() {
        return "ClientRepository{" +
                "clientMap="  +
                '}';
    }

    @Override
    public Client getClientById(int id) throws SQLException {
        con = DriverManager.getConnection(url, user, pass);
        st = con.createStatement();
        String sql = ("Select CLIENTID,LOGIN,PASSWORD,EMAIL,NAME,SURNAME,BALANCE FROM CLIENT where clientid =" + id) ;
        rs = st.executeQuery(sql);
        Client client;
        while(rs.next())
        {
            String login = rs.getString("login");
            String password = rs.getString("password");
            String email = rs.getString("email");
            String name = rs.getString("name");
            String surname= rs.getString("surname");
            double balance = rs.getDouble("Balance");

            client = new Client(id,login,password,balance ,email,name,surname);
            return client;
        }
        return null;
    }

    @Override
    public void deleteClient(int id) throws SQLException {
        con = DriverManager.getConnection(url,user,pass);
        st = con.createStatement();
        String sql = ("delete from CLIENT where clientid  =" + id);
        System.out.println(sql);
        rs = st.executeQuery(sql);
        rs = st.executeQuery("commit");
    }
}
