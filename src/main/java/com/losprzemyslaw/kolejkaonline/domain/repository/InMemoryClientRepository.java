package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.Client;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.SQLException;
import java.util.*;

public class InMemoryClientRepository implements ClientRepository {
    Map <String, Client> clientMap= new HashMap<>() ;

    @Override
    public void addClient(Client client) {
        //clientMap.put(name,new Client(id,login,password,balance,email,name,surname));
    }

    @Override
    public void removeClient(String name){
        clientMap.remove(name);
    }
    @Override
    public List<Client> getAllClients(){
       // return clientMap.values();
        return null;
    }

    @Override
    public Client getClient(String name){
        return clientMap.get(name);
    }

    @Override
    public String toString() {
        return "ClientRepository{" +
                "clientMap=" + clientMap +
                '}';
    }

    @Override
    public Client getClientById(int id) {
        return null;
    }

    @Override
    public void deleteClient(int id) throws SQLException {

    }

    @PostConstruct
    public void build(){

    }
}