package com.losprzemyslaw.kolejkaonline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String load(){
        return "home";
    }

    @RequestMapping("/foryourbusiness")
    public String loadComp(){return "foryourbusiness" ;}

    @RequestMapping("/foryou")
    public String loadClient(){return "foryou";}

    @RequestMapping("/login")
    public String login(){return "loginform";}
}
