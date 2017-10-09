package com.artek.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.artek.model.CourseDto;
import com.artek.model.UserDto;

@Repository
public class CoursesRepositry {
	@Autowired
	HibernateTemplate hibernateTemplate;

	public void CourseOfRepoSave(CourseDto courseDto) {
		System.out.println("CoureseRepositry");
		hibernateTemplate.save(courseDto);
	}

	public List getCourseRepo() {
		List list = hibernateTemplate.find("from CourseDto");
		return list;
	}

	@Transactional
	public void deleteRepo(int id) {
		/*
		 * System.out.println("DeleteRepo"); String delete =
		 * "delete from CourseDto where id =?"; hibernateTemplate.update(delete,
		 * id);
		 * //hibernateTemplate.bulkUpdate("delete from CourseDto where id=?",
		 * id);
		 */

		Session s = hibernateTemplate.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		CourseDto dto = new CourseDto();
		dto.setCid(id);
		
		s.delete(dto);
		tx.commit();
	}

	public List updateRepo(int id) {
		List list = hibernateTemplate.find("from CourseDto where cid= ?" ,id);
		for(Object obj:list)
		{
			CourseDto courseDto=(CourseDto)obj;
		System.out.println(courseDto.getFacalityName());
		}
		return list;
	}
	public void UpdateValveRepo(CourseDto courseDto)
	{
		System.out.println("UpdateValveRepo");
		Session s = hibernateTemplate.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
			s.update(courseDto);
			tx.commit();
	}
}
