package com.artek.controller;

import java.util.Map;

import javax.naming.Context;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.artek.model.UserDto;
import com.artek.service.RegistrationService;
import com.artek.validation.RegistrationValidation;

@Controller
public class RegistrationController 
{
	@Autowired
	public RegistrationService registrationService;
	@Autowired
	public RegistrationValidation registerValid;
	@RequestMapping("/Registration")
public String showRegistration(Map<String, Object> map)
{
		
		
	System.out.println("Controller");
	map.put("user" ,new UserDto() );

	return "registration";
}
	@RequestMapping(value="/saveRegist", method=RequestMethod.POST)
	public String CheckRegist(@ModelAttribute("user") UserDto user ,BindingResult bindResult  )
	{
		System.out.println("Controller Registration");
		System.out.println(user.getFname()+"   "+user.getLname()+"   "+user.getAddress()+"    "+user.getMobileNo());
		
		registerValid.validate(user, bindResult);
		
		if(bindResult.hasErrors())
		{
			return "registration";
			
		}
		else {
			
			registrationService.registrationService(user);
			return "result" ;
		}
		
	}
}
