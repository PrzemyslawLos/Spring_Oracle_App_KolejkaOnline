package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.Client;
import com.losprzemyslaw.kolejkaonline.domain.Queue;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemoryQueueRepository implements QueueRepository {
    Map<String, Queue> queueMap = new HashMap<>();

    @Override
    public void addQueue(int id, String companyName, int maxSize, int numberOfPlaces){
        queueMap.put(companyName, new Queue(id,companyName,maxSize,numberOfPlaces));
    }

    @Override
    public void removeQueue(String companyName){
        queueMap.remove(companyName);
    }

    @Override
    public Queue getQueue(String companyName){
        return queueMap.get(companyName);
    }

    @Override
    public Collection<Queue> getAllQueue(){
        return queueMap.values();
    }


    @Override
    public String toString() {
        return "QueueRepository{" +
                "queueMap=" + queueMap +
                '}';
    }
}