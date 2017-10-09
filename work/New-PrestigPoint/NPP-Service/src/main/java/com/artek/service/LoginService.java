package com.artek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.artek.model.UserDto;
import com.artek.repository.LoginRepositry;

@Service
public class LoginService 
{
@Autowired
public LoginRepositry loginRepositry;
public UserDto serviceLogin(UserDto user)
{
	
	System.out.println("LoginService");
	System.out.println(user.getEmail()+"   "+user.getPassword());
	loginRepositry.userSingIn(user.getEmail(),user.getPassword());
return user;	
}
}
