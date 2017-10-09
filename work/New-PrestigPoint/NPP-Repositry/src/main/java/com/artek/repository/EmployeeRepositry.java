package com.artek.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.artek.model.EmployeeDto;

@Repository
public class EmployeeRepositry {
	@Autowired
	HibernateTemplate hibernateTemplate;
public void saveRepositry( EmployeeDto employeeDto)
{
	System.out.println("In Employee's Repo Save ");
	//hibernateTemplate.save(employeeDto);
	Session s = hibernateTemplate.getSessionFactory().openSession();
	Transaction tx = s.beginTransaction();
	s.save(employeeDto);
	tx.commit();
}
}
