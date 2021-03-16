package com.losprzemyslaw.kolejkaonline.controllers;

import com.losprzemyslaw.kolejkaonline.domain.DTO.Client_QueueDTO;
import com.losprzemyslaw.kolejkaonline.domain.DTO.QueueCompanyDTO;
import com.losprzemyslaw.kolejkaonline.services.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;

@Controller
public class QueueController {
    @Autowired
    QueueService queueService;

    @RequestMapping("/queues")
    public String getQueues(Model model) throws SQLException {
        List<QueueCompanyDTO> allQueues =  queueService.getAllQueues();
        model.addAttribute("queues", allQueues);
        return "queues";
    }
    @RequestMapping("/queue")
    public String getQueue(@RequestParam("queueId") Integer id, Model model) throws SQLException {//parametr z adresu url
        List<Client_QueueDTO> clientsInQueue = queueService.getQueueDetail(id);
        model.addAttribute("queue", clientsInQueue);
        return "queue";
    }
}
