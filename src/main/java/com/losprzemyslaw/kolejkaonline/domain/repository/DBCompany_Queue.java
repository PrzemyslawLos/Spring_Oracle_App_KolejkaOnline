package com.losprzemyslaw.kolejkaonline.domain.repository;

import com.losprzemyslaw.kolejkaonline.domain.Queue;

import java.util.Collection;

public class DBCompany_Queue implements Company_QueueRepostiory {
    @Override
    public void addCompany_Queue(int companyID, int queueID){

    }

    @Override
    public void removeCompany_Queue(String companyName){

    }

    @Override
    public Queue getCompany_Queue(String companyName){
        return null;
    }

    @Override
    public Collection<Queue> getAllCompany_Queue(){
        return null;
    }


    @Override
    public String toString() {
        return "QueueRepository{" +
                "queueMap="  +
                '}';
    }
}
