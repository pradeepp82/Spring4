package com.artek.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.artek.model.CourseDto;

@Component
public class CourseValidation implements Validator 
{

	public boolean supports(Class<?> clas) {
		
		return CourseDto.class.isAssignableFrom(clas);
	}

	public void validate(Object target, Errors errors) {
		CourseDto courseDto= (CourseDto) target;
		ValidationUtils.rejectIfEmpty(errors, "cName", "error.cname.empty");
		ValidationUtils.rejectIfEmpty(errors, "facalityName", "error.fname.empty");
		ValidationUtils.rejectIfEmpty(errors, "cStartDate", "error.startdate.empty");
		ValidationUtils.rejectIfEmpty(errors, "cEndDate", "error.enddate.empty");
		}

}
