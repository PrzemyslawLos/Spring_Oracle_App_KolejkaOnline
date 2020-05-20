package com.losprzemyslaw.kolejkaonline;

import com.losprzemyslaw.kolejkaonline.domain.repository.ClientRepository;
import com.losprzemyslaw.kolejkaonline.domain.repository.InMemoryClientRepository;
import com.losprzemyslaw.kolejkaonline.domain.repository.QueueRepository;
import com.losprzemyslaw.kolejkaonline.services.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    QueueRepository queueRepository;

    @Autowired
    QueueService queueService;


    @Override
    public void run(String... args) throws Exception {
      /*  System.out.println("hello");
        queueService.addToQueue("Janusz","kolejka1");
        System.out.println(queueRepository);
        queueService.addToQueue("Janina","kolejka1");
        queueService.addToQueue("Janusz","kolejka1");
        queueService.addToQueue("Janina","kolejka1");

        System.out.println(queueRepository);
        queueService.removeFromQueueNext("kolejka1");
        System.out.println(queueRepository);
        queueService.removeFromQueueNext("kolejka1");
        System.out.println(queueRepository);

        companyAdminRepository.addACompanyAdmin("kolejka3", "jacek12", "12345678");
        System.out.println(companyAdminRepository);
        companyAdminRepository.addACompanyAdmin("kolejka4", "jacek123", "123456789");
        System.out.println(companyAdminRepository); */


    }
}