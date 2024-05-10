package com.rahul.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name","Rahul Pannati");
    model.addAttribute("title","Home - Smart Contact Manager");
    model.addAttribute("message","Welcome to the Home Page");
    model.addAttribute("instagram","rahulpannati");
    model.addAttribute("twitter", "rahulviratCOC");

        System.out.println("Inside Home Page");
        return "home";

    }
    //if we want to send dynamic data to the view we need to use the Model object as a parameter from org.springframework.ui.Model
    // mode.addAttribute("name",name) will send the name to the view and we can access it using ${name} in the view 
    
 
    @RequestMapping("/about")
    public String about(Model model){
        String name = "Rahul";
        model.addAttribute("name",name);
        System.out.println("Inside About Page");
        return "about";
    }





}
