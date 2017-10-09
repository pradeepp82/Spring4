package com.artek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artek.model.UserDto;
import com.artek.repository.RegistrationRepositry;

@Service
public class RegistrationService {
	@Autowired
	public RegistrationRepositry registrationRepositry;

	public void registrationService(UserDto user) {
		System.out.println("Registration ");

		System.out.println(
				user.getFname() + "   " + user.getLname() + "   " + user.getAddress() + "    " + user.getMobileNo());
		registrationRepositry.saveRepo(user);
		System.out.println(user.getId()+"   "+user.getFname()+user.getLname());
		System.out.println(user.getMobileNo()+"   "+ user.getEmail()+"   "+user.getPassword());
	}
}
