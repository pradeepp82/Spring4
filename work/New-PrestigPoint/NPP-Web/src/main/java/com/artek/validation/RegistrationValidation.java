package com.artek.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.artek.model.UserDto;
import com.artek.repository.RegistrationRepositry;
import com.artek.service.RegistrationService;
@Component
public class RegistrationValidation implements Validator
{
	@Autowired
	public RegistrationRepositry regRepo;
	public boolean supports(Class<?> claz) {
		
		return UserDto.class.isAssignableFrom(claz);
	}

	public void validate(Object target, Errors errors) 
	{
	UserDto userdto = (UserDto) target;
	   ValidationUtils.rejectIfEmpty(errors, "fname","error.firstname.empty");
	   ValidationUtils.rejectIfEmpty(errors, "lname","error.lastname.empty");
	   ValidationUtils.rejectIfEmpty(errors, "address","error.address.empty");
	   ValidationUtils.rejectIfEmpty(errors, "mobileNo","error.mobileNo.empty");
	   ValidationUtils.rejectIfEmpty(errors, "email","error.email.empty");
	   ValidationUtils.rejectIfEmpty(errors, "password","error.password.empty");
	   
	   if(!errors.hasErrors())
	   {
if (userdto.getFname().length()>15) 
{
	 errors.rejectValue("fname", "error.firstname.longlenth");
	 
}	
	 if (userdto.getLname().length()>15) {
		errors.rejectValue("lname", "error.lastname.longlength");
	}
	 if (userdto.getAddress().length()>40) {
		errors.rejectValue("lname", "error.address.longlength");
	}
 if (userdto.getMobileNo().length()!=10 ) {
	errors.rejectValue("mobileNo", "error.mobilelenth.longlength");
}
 else {
	

try {
	Long.parseLong(userdto.getMobileNo());
} catch (Exception e) {
	errors.rejectValue("mobileNo", "error.mobille_Int.longlength");
}
 }
 if (userdto.getPassword().length()<8 ) {
	errors.rejectValue("password", "error.passwordlength.long");
}
 else if (userdto.getPassword().contains("@")!=true && userdto.getPassword().contains("&")!=true && userdto.getPassword().contains("%")!=true && userdto.getPassword().contains("#")!=true && userdto.getPassword().contains("!")!=true && userdto.getPassword().contains("$")!=true) {
	 errors.rejectValue("password", "error.Special.character");
}
 if (userdto.getEmail().contains("@")==true && userdto.getEmail().contains(".")==true)
 {
	String email = userdto.getEmail();
	System.out.println(email);
	email = email.replace(".", "@");
	String[] email1 = email.split("@");
	for (String string : email1) {
		if (string.length()==0) 
		{
			errors.rejectValue("email", "error.email.formate");
			break; 
		}
	}
}
	   }
	   if(!errors.hasErrors())
	   {
 if (regRepo.userSingInRepo(userdto)) 
 {
	 errors.rejectValue("email", "error.email.exites");
}
	}
	}
}
