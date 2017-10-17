package com.mywork.web1.controllers;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


	@RequestMapping("/home")
	public String home() throws SQLException {
		
		return "home";

	}
	
	
	@RequestMapping("/about")
	public String about() throws SQLException {
		
		return "about";

	}
	
	
	@RequestMapping("/gallery")
	public String gallery() throws SQLException {
		
		return "gallery";

	}
}


