package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;

//controller extends from Component. so it is scannable.
//@controller makes this a controller in the MVC framework.
@Controller
@Api(value="onlinestore")
public class HomeController {

	//map the URL to the root  "/" to do this method.
	@RequestMapping("/")
	public String showMyPage(){
		
		//not the complete name of the page the prefix and suffix is defined in the servlet.xml
		return "main-menu"; 
	}
	
	
}
