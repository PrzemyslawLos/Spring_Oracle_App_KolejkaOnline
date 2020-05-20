package com.losprzemyslaw.kolejkaonline.controllers;

import com.losprzemyslaw.kolejkaonline.domain.Client;
import com.losprzemyslaw.kolejkaonline.domain.repository.ClientRepository;
import com.losprzemyslaw.kolejkaonline.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.sql.SQLException;
import java.util.List;

@Controller
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping("/clients")
    public String getClients(Model model) throws SQLException {
        List<Client> allClients = clientService.getAllClients();
        model.addAttribute("clients", allClients);
        return "clients";
    }

    @RequestMapping("/client")
    public String getClient(@RequestParam("id") Integer id, Model model) throws SQLException { //parametr z adresu url
        Client client = clientService.getClient(id);
        System.out.println(client);
        model.addAttribute("client", client);
        return "client";
    }

    @RequestMapping("/newclient")
    public String addClient(Model model) throws SQLException {
        model.addAttribute("client", new Client());
        return "clientform";
    }

    @RequestMapping(value ="/clients", method = RequestMethod.POST)
    public String saveClient(@Valid Client client, BindingResult bindingResult) throws SQLException, ClassNotFoundException {
        if(bindingResult.hasErrors()){
            return "clientform";
        }else {
            clientService.addClient(client);
            return "redirect:/clients";
        }

    }
    @RequestMapping(value ="/client/delete/{id}")
    public String deleteClient(@PathVariable("id") Integer id) throws SQLException {
        clientService.deleteClient(id);
        return "redirect:/clients";
    }
}
