package com.fullapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fullapp.services.DataService;
import com.fullapp.utilities.ApplicationData;
import com.fullapp.utilities.SessionData;

@Controller
@RequestMapping("/web")
public class FirstController {
	
	@Autowired
	private DataService service;
	
	@Autowired
	private SessionData session;
	
	@Autowired
	private ApplicationData application;

	 @RequestMapping("/hello")
	 public String gohome(ModelMap map) {
		 map.addAttribute("names",service.getNames()); //request scope
		 session.setData();
		 application.setData();
		 map.addAttribute("sdata",session.getData());
		 map.addAttribute("adata",application.getData());
		 return "home";
	 }
	 
	
}
