package com.artek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artek.model.EmployeeDto;
import com.artek.repository.EmployeeRepositry;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepositry employeeRepositry;
public void saveService(EmployeeDto employeeDto)
{
	System.out.println("In Employee's Services Save");
	employeeRepositry.saveRepositry(employeeDto);
}
}
