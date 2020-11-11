package com.stackroute.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String firstPage(ModelMap model) {
		model.addAttribute("name", "Delhi");
		return "index";
	}
	
	@RequestMapping(value="/home/login", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/home/processlogin", method=RequestMethod.POST)
	public String processLogin(ModelMap model, HttpServletRequest request) {
		String uname = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		if(uname.equals("admin") && password.equals("admin")) {
			model.addAttribute("username", uname);
			return "successlogin";
		}
		return "errorlogin";
	}
}
