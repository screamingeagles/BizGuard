package com.management.controller;

import com.management.entity.*;



import java.util.Map;
import java.util.LinkedHashMap;

import org.springframework.ui.ModelMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/transaction")
public class TransactionController {
	
	@RequestMapping(value = "/grn", method = RequestMethod.GET)
	public String grn(ModelMap model){
		
		try{			
			
			Map<String,String> country = new LinkedHashMap<String,String>();
			country.put("US", "United Stated");
			country.put("CHINA", "China");
			country.put("SG", "Singapore");
			country.put("MY", "Malaysia");			
			model.addAttribute("countryList",country);
		
			System.out.print("\nIndex Working end!!!");
		}
		catch(Exception ex){
			model.addAttribute("message",ex.getMessage());		
		}		
		
		return "grn";
	}



	@RequestMapping(value="/**",method = RequestMethod.GET)
	public ResponseEntity<String> defaultPath(){
		return new ResponseEntity<String>("Please Check your URL!!!", HttpStatus.OK);
	}

}