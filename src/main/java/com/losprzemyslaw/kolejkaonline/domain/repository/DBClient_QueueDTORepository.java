package com.losprzemyslaw.kolejkaonline.domain.repository;
import com.losprzemyslaw.kolejkaonline.domain.DTO.Client_QueueDTO;
import oracle.jdbc.driver.OracleDriver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBClient_QueueDTORepository {
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
    public List<Client_QueueDTO> getAllClientsInQueueDTO(int id) throws SQLException {
        con = DriverManager.getConnection(url, user, pass);
        st = con.createStatement();
        String sql = ("select cl.clientid, cl.login, cl.name, cq.c_number, cq.queueid\n" +
                "from client cl\n" +
                "join client_queue cq on cl.clientid = cq.clientid\n" +
                "where cq.queueid =" + id + " " +
                "order by cq.c_number");
        System.out.println(sql);
        rs = st.executeQuery(sql);
        List<Client_QueueDTO> clientsInQueueDTO = new ArrayList<>();
        int clientId, c_number, queueId;
        String login, name;

        while (rs.next()) {
            clientId = rs.getInt("clientId");
            login = rs.getString("login");
            name = rs.getString("name");
            c_number = rs.getInt("c_number");

            clientsInQueueDTO.add(new Client_QueueDTO(clientId,c_number,login,name));
        }

        return clientsInQueueDTO;

    }
}
