package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {
	
	//@ResponseBody
	@RequestMapping("/cricketbat")
	public String bat()
	{
		//return "/WEB-INF/view/MRFCricketbat.jsp";
		return "MRFCricketbat";
	}

}
