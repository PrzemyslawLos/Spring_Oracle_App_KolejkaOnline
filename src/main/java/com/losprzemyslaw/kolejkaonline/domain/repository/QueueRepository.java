package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.DTO.QueueCompanyDTO;
import com.losprzemyslaw.kolejkaonline.domain.Queue;

import javax.annotation.PostConstruct;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public interface QueueRepository {
    void addQueue(Queue queue) throws  SQLException;

    void removeQueue(String companyName);

    Queue getQueue(String companyName);

    List<QueueCompanyDTO> getAllQueues() throws SQLException;

    @Override
    String toString();
}
