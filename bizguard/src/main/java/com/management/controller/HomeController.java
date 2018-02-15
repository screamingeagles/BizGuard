package com.management.controller;


//import com.management.common.*;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap model){
		
		try{	
			System.out.print("\nBegin");
			model.addAttribute("message","from controller");
		
			List<String> reciepients = new ArrayList<String>();
			reciepients.add("arsalan@rethinktechs.com");
					

			System.out.print("\nWorking end!!!");
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

	@RequestMapping(value="/**",method = RequestMethod.GET)
	public ResponseEntity<String> defaultPath(){
		return new ResponseEntity<String>("Please Check your URL!!!", HttpStatus.OK);
	}

}
