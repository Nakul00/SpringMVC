package com.home.mycafe.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyCafeController {
	
	//Return the welcome page
	@RequestMapping("/cafe")
	public String welcomePage(Model model) //Model model no need
	{
		/*sending data to view(jsp page)
		String myName  = "Nakul";
	    //model.addAttribute("title", "Welcome to Mom's Cafe!");*/
		
		return "welcome-page";
			
	}
	
	@RequestMapping("/processOrder") //for-action name
	public String order(HttpServletRequest request, Model model)
	{
		//handle the data received from the user
		String enteredValue = request.getParameter("foodType");
		
		//adding the captured value to the model
		model.addAttribute("userInput", enteredValue);
		
		return "process-order";
	}

}
