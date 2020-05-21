package com.losprzemyslaw.kolejkaonline.controllers;

import com.losprzemyslaw.kolejkaonline.domain.DTO.QueueCompanyDTO;
import com.losprzemyslaw.kolejkaonline.services.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
