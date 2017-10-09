package com.artek.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.artek.model.UserDto;
import com.artek.repository.LoginRepositry;
@Component
public class LoginValidation implements Validator
{
@Autowired 
LoginRepositry loginRepositry;
	public boolean supports(Class<?> cls) {
		UserDto.class.isAssignableFrom(cls);
		return false;
	}

	public void validate(Object target, Errors errors) {
		UserDto userDto = (UserDto) target;
		ValidationUtils.rejectIfEmpty(errors, "email", "error.loginemail.empty");
		ValidationUtils.rejectIfEmpty(errors, "password","error.loginpassword.empty");
	
		
		if(!loginRepositry.userSingIn(userDto.getEmail(), userDto.getPassword()))
		{
			errors.rejectValue("email", "error.loginemail.has");
		}
	}

}
