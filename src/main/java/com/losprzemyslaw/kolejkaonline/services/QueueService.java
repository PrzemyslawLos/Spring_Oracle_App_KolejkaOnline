package com.losprzemyslaw.kolejkaonline.services;

import com.losprzemyslaw.kolejkaonline.domain.Client;
import com.losprzemyslaw.kolejkaonline.domain.repository.ClientRepository;
import com.losprzemyslaw.kolejkaonline.domain.repository.InMemoryClientRepository;
import com.losprzemyslaw.kolejkaonline.domain.repository.QueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueueService {

    @Autowired
    QueueRepository queueRepository;

    @Autowired
    ClientRepository clientRepository;

    public void showQueues(){
        System.out.println(queueRepository);
    }



}
