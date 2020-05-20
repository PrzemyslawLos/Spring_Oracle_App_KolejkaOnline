package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.Client;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public interface ClientRepository {

    void addClient(Client client) throws SQLException,ClassNotFoundException;


    void removeClient(String name) throws SQLException;

    List<Client> getAllClients() throws  SQLException;

    Client getClient(String name);

    @Override
    String toString();

    Client getClientById(int id) throws SQLException;

    void deleteClient(int id) throws SQLException;
}
