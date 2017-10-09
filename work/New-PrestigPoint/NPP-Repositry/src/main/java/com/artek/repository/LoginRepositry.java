package com.artek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.artek.model.UserDto;

@Repository
public class LoginRepositry {
	@Autowired
private	HibernateTemplate hibernateTemplate;
/*public UserDto repoLogic(UserDto user)
{
	
	System.out.println("LoginRepo");
	System.out.println(user.getEmail()+"   "+user.getPassword());
return user ;	
}*/
public boolean userSingIn(String email, String password)
{
	
	List<UserDto> login=(List<UserDto>) hibernateTemplate.find("from UserDto ud where ud.email=? and ud.password=?",email,password);
if(login.size()>0)
{
return true;	
}
return false;
}
}
