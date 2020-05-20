package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.Queue;

import javax.annotation.PostConstruct;
import java.util.Collection;

public interface QueueRepository {
    void addQueue(int id,String companyName, int maxSize, int numberOfPlaces);

    void removeQueue(String companyName);

    Queue getQueue(String companyName);

    Collection<Queue> getAllQueue();

    @Override
    String toString();
}
