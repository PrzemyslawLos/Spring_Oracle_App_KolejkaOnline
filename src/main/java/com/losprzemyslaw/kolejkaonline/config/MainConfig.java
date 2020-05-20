package com.losprzemyslaw.kolejkaonline.config;

import com.losprzemyslaw.kolejkaonline.domain.repository.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

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

}
