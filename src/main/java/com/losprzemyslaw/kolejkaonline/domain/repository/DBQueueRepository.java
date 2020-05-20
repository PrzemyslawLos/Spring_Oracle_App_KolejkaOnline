package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.Queue;

import javax.annotation.PostConstruct;
import java.util.Collection;

public class DBQueueRepository implements QueueRepository {

    @Override
    public void addQueue(int id,String companyName, int maxSize, int numberOfPlaces){

    }

    @Override
    public void removeQueue(String companyName){

    }

    @Override
    public Queue getQueue(String companyName){
        return null;
    }

    @Override
    public Collection<Queue> getAllQueue(){
        return null;
    }


    @Override
    public String toString() {
        return "QueueRepository{" +
                "queueMap="  +
                '}';
    }

}
