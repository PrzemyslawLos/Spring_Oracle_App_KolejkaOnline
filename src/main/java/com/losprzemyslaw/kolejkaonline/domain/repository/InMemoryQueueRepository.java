package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.Client;
import com.losprzemyslaw.kolejkaonline.domain.DTO.QueueCompanyDTO;
import com.losprzemyslaw.kolejkaonline.domain.Queue;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryQueueRepository implements QueueRepository {

    @Override
    public void addQueue(Queue queue) throws SQLException {

    }

    @Override
    public void removeQueue(String companyName) {

    }

    @Override
    public Queue getQueue(String companyName) {
        return null;
    }

    @Override
    public List<QueueCompanyDTO> getAllQueues() throws SQLException {
        return null;
    }
}