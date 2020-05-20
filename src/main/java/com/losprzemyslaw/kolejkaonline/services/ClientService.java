package com.losprzemyslaw.kolejkaonline.services;

import com.losprzemyslaw.kolejkaonline.domain.Client;
import com.losprzemyslaw.kolejkaonline.domain.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClients() throws SQLException {
        return new ArrayList<>(clientRepository.getAllClients());
    }

    public void addClient(Client client) throws SQLException, ClassNotFoundException {
        clientRepository.addClient(client);
    }


    public Client getClient(Integer id) throws SQLException {
        return clientRepository.getClientById(id);
    }

    public void deleteClient(int id) throws SQLException {
        clientRepository.deleteClient(id);
    }
}
