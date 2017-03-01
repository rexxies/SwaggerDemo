package com.luv2code.springdemo.mvc;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Reguillo on 23-2-2017.
 */

@Controller
public class HelloWorldController {

    //need a controller method to show initial html form
    @RequestMapping("/showForm")
    public String showForm(){
        return"helloworld-form";
    }

    // controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    //controller method to read form data and add data to model.
    @RequestMapping("/processFormVersionTwo")
    public String allCaps(HttpServletRequest request, Model model){

        String theName = request.getParameter("studentName");

        //to uppercase
        theName = theName.toUpperCase();

        //create message
        String result = "Yo! "+ theName;

        model.addAttribute("message", result);

        return "helloworld";
    }
}
