package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String makeup()
	{
		return "Here is your makeup";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String books()
	{
		return "Math book";
	}

}
