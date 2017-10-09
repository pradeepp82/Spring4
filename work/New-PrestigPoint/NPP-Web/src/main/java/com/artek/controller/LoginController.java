package com.artek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.artek.model.UserDto;
import com.artek.service.LoginService;
import com.artek.validation.LoginValidation;

@Controller
public class LoginController {
	@Autowired
	public LoginService loginService;
	@Autowired
	public LoginValidation loginValidation;

	@RequestMapping("/login")
	public String showLogin(Map<String, Object> map) {
		System.out.println("Controller");
		map.put("user", new UserDto());
		return "login";
	}

	@RequestMapping(value = "/saveLogin", method = RequestMethod.POST)
	public String checklogin(@ModelAttribute("user") UserDto user, BindingResult result) {
		System.out.println("Check login");
		System.out.println(user.getEmail() + "     " + user.getPassword());
		loginService.serviceLogin(user);
		loginValidation.validate(user, result);
		if (result.hasErrors()) {
			return "login";
		}
		return "redirect:/CourseForm.do";

	}
}
