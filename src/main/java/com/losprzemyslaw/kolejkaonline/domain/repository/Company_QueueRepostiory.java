package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.Queue;

import java.util.Collection;

public interface Company_QueueRepostiory {
    void addCompany_Queue(int companyID, int queueID);

    void removeCompany_Queue(String companyName);

    Queue getCompany_Queue(String companyName);

    Collection<Queue> getAllCompany_Queue();

    @Override
    String toString();
}
