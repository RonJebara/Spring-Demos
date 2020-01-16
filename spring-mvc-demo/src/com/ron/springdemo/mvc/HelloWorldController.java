package com.ron.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	
	//Need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
			return "helloworld-form";
	}
	
	//Need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//New controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShout(HttpServletRequest request, Model model) {
		//Read the request parameter
		String theName = request.getParameter("studentName");
		//Convert data to all uppercase
		theName = theName.toUpperCase();
		//Create the message
		String result = "Yo " + theName + "!";
		//Add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutrequest(@RequestParam("studentName") String theName, Model model) {
		//Convert data to all uppercase
		theName = theName.toUpperCase();
		//Create the message
		String result = "YO " + theName + "!";
		//Add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
