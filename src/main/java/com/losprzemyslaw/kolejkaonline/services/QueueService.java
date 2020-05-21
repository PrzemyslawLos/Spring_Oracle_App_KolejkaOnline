package com.losprzemyslaw.kolejkaonline.services;

import com.losprzemyslaw.kolejkaonline.domain.Client;
import com.losprzemyslaw.kolejkaonline.domain.DTO.QueueCompanyDTO;
import com.losprzemyslaw.kolejkaonline.domain.repository.ClientRepository;
import com.losprzemyslaw.kolejkaonline.domain.repository.CompanyRepository;
import com.losprzemyslaw.kolejkaonline.domain.repository.InMemoryClientRepository;
import com.losprzemyslaw.kolejkaonline.domain.repository.QueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class QueueService {

    @Autowired
    QueueRepository queueRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    CompanyRepository companyRepository;

    public List<QueueCompanyDTO> getAllQueues() throws SQLException {
        return new ArrayList<>(queueRepository.getAllQueues());

    }


}
