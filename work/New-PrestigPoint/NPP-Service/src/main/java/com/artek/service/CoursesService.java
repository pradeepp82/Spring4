package com.artek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.artek.model.CourseDto;
import com.artek.repository.CoursesRepositry;

@Service
public class CoursesService {
	@Autowired
	public CoursesRepositry coureseRepositry;

	public void courseOfServiceSave(CourseDto courseDto) {
		System.out.println("CoureseService save");
		coureseRepositry.CourseOfRepoSave(courseDto);// For Save
	}

	public List getCourseService() {
		List list = coureseRepositry.getCourseRepo();
		return list;
	}

	public void deleteService(int cid) {
		System.out.println("deleteService");
		coureseRepositry.deleteRepo(cid);// For Delete
	}

	public List updateService(int id) {
		List list = coureseRepositry.updateRepo(id);
		return list;
	}
	public void UpdateValveService(CourseDto courseDto)
	{
		coureseRepositry.UpdateValveRepo(courseDto);
		System.out.println("UpdateValveService");
	}
}
