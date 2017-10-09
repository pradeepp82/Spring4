package com.artek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.artek.model.UserDto;

@Repository
public class RegistrationRepositry
{
	@Autowired
	private	HibernateTemplate hibernateTemplate;
public boolean userSingInRepo(UserDto user )
{
	List<UserDto> registr=(List<UserDto>) hibernateTemplate.find("from UserDto where email= ?", user.getEmail());
	System.out.println(registr);
	if(!registr.isEmpty())
	{
		System.out.println("Can not Register,email alreday exist");	
		return true;
		
	}
	return false;
	
}
public void saveRepo(UserDto user)
{
	hibernateTemplate.save(user);
	}
}
