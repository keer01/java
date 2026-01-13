package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	
	
	@GetMapping("/ulogin")
	public String userLoginPage() {
		return "login";
	}
	
	@PostMapping("/submit")
	public String submitUserForm(HttpServletRequest request)
	{
		String usr= request.getParameter("user");
		
		String pas=request.getParameter("pwd");
		if(usr.equals("admin") && pas.equals("a123"))
		{
			return "success";
		}
		
		else
		{
			return "login";
		}
	}

}
