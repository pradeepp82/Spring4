package com.artek.webservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import com.artek.model.StudentDto;

@Controller
public class WserClass {
	@RequestMapping(method=RequestMethod.GET, value="/Student/{id}",headers="Accept=application/json")
public @ResponseBody StudentDto wcStud(@PathVariable("id") String id, ModelMap map)
{
		StudentDto st = new StudentDto();
		
		st.setSid(Integer.valueOf(id));
		st.setName("a");
		st.setAddress("b");
		st.setMobileNo("123");
		System.out.println("WEB SERVICE IS CALLING");
	return st;
}
	@RequestMapping(value="/Student", method= RequestMethod.POST)
	public @ResponseBody void wcStudSave(@RequestBody StudentDto studentDto)
	{
		System.out.println(studentDto.getSid()+"    "+studentDto.getName()+"   "+studentDto.getMobileNo()+"   "+studentDto.getAddress());
	}
}
