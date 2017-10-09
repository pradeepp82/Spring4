package com.artek.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.artek.model.AddressDto;
import com.artek.model.EmployeeDto;
import com.artek.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
@RequestMapping(value="/EmpRegister",method={RequestMethod.GET,RequestMethod.POST})
public String EmployeeSave(@ModelAttribute("emp") EmployeeDto employeeDto ,ModelMap map,HttpServletRequest request,HttpServletResponse response)
{

	
if(request.getMethod().equals("GET"))
{
map.addAttribute("emp", new EmployeeDto());
System.out.println("In Employee Get method");
}
else {
	
	List list= employeeDto.getListAdd();
	System.out.println(employeeDto.getEid()+"       "+employeeDto.getName()+"    "+employeeDto.getMobNo());
	Iterator itr = list.iterator();
	while(itr.hasNext())
	{
		AddressDto add = (AddressDto) itr.next();
		System.out.println(add.getpNo()+"    "+add.getCity()+"   "+add.getState());
	}
employeeService.saveService(employeeDto);
}
return "empReg";
}
}
