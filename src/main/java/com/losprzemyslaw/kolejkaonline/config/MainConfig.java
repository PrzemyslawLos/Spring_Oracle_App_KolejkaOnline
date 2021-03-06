package com.losprzemyslaw.kolejkaonline.config;

import com.losprzemyslaw.kolejkaonline.domain.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class MainConfig {

    @Bean(name = "inMemoryClientRepository")
    @Profile("dev")
    public ClientRepository createInMemoryClientRepository() {
        ClientRepository repo = new InMemoryClientRepository();
        return repo;
    }

    @Bean(name = "inMemoryQueueRepository")
    @Profile("dev")
    public QueueRepository createInMemoryQueueRepository() {
        QueueRepository repo = new InMemoryQueueRepository();
        return repo;
    }


    @Bean(name = "dbClientRepository")
    @Profile("prod")
    public ClientRepository createDBClientRepository() {
        ClientRepository repo = new DBClientRepository();
        return repo;
    }

    @Bean(name = "dbQueueRepository")
    @Profile("prod")
    public QueueRepository createDBQueueRepository() {
        QueueRepository repo = new DBQueueRepository();
        return repo;
    }

    @Bean(name = "dbCompanyRepository")
    @Profile("prod")
    public CompanyRepository createDBCompanyRepository() {
        CompanyRepository repo = new DBCompanyRepository();
        return repo;
    }
    @Bean(name = "dbClient_QueueDTORepository")
    @Profile("prod")
    public DBClient_QueueDTORepository createDBClient_QueueDTORepository() {
        DBClient_QueueDTORepository repo = new DBClient_QueueDTORepository();
        return repo;
    }



}
