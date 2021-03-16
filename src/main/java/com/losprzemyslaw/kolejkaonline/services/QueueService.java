package com.losprzemyslaw.kolejkaonline.services;

import com.losprzemyslaw.kolejkaonline.domain.Client;
import com.losprzemyslaw.kolejkaonline.domain.DTO.Client_QueueDTO;
import com.losprzemyslaw.kolejkaonline.domain.DTO.QueueCompanyDTO;
import com.losprzemyslaw.kolejkaonline.domain.repository.*;
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

    @Autowired
    DBClient_QueueDTORepository client_queueDTORepository;

    public List<QueueCompanyDTO> getAllQueues() throws SQLException {
        return new ArrayList<>(queueRepository.getAllQueues());

    }
    public List<Client_QueueDTO> getQueueDetail(int id) throws SQLException {
        return new ArrayList<>(client_queueDTORepository.getAllClientsInQueueDTO(id));
    }


}
