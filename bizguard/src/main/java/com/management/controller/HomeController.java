package com.management.controller;

import com.management.entity.*;



import java.util.List;
import java.util.ArrayList;

import org.springframework.ui.ModelMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap model){
		
		try{
			System.out.print("\nBegin index");
			
			model.addAttribute("message","from controller");
		
			List<String> reciepients = new ArrayList<String>();
			reciepients.add("arsalan@rethinktechs.com");
					

			System.out.print("\nIndex Working end!!!");
		}
		catch(Exception ex){
			System.out.print("exception : " + ex.getMessage());
			model.addAttribute("message",ex.getMessage());		
		}		
		
		return "home";
	}

	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model){
		
		try{	
			System.out.print("\nBegin");
			model.addAttribute("message","welcome controller");
			model.addAttribute("title","Welcome Page");
			System.out.print("\nWorking end!!!");
		}
		catch(Exception ex){
			System.out.print("exception : " + ex.getMessage());
		}		
		
		return "welcome";
	}

	
	@RequestMapping(value = "/process", method = RequestMethod.POST)
	public void process(HttpServletRequest request,HttpServletResponse response){
		
		try{	
			String UserEmail;			
			String UserPassword;
			UserEmail 	 = request.getParameter("UserName");
			UserPassword = request.getParameter("UserPassword");
			
			UserInterface ui = dbhelper.CheckLogin(UserEmail, UserPassword);
			System.out.print("\ndatabase  " + ui.getUserId());
			if (ui.getUserId() > 0){				
				response.sendRedirect("/bizguard/home/welcome");
			}
			else {								
				response.sendRedirect("/bizguard/home/index"); //this is working
			}
		}
		catch(Exception ex){
			System.out.print("exception : " + ex.getMessage());
		}		
	}


	@RequestMapping(value="/**",method = RequestMethod.GET)
	public ResponseEntity<String> defaultPath(){
		return new ResponseEntity<String>("Please Check your URL!!!", HttpStatus.OK);
	}

}
