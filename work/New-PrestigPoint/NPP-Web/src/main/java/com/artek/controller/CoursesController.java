package com.artek.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.artek.model.CourseDto;
import com.artek.model.UserDto;
import com.artek.service.CoursesService;
import com.artek.validation.CourseValidation;

@Controller
public class CoursesController {
	@Autowired
	public CoursesService courseService;
	@Autowired
	CourseValidation courseValidation;

	@RequestMapping(value = "/CourseForm", method = RequestMethod.GET)
	public String courseShow(ModelMap map1) {
		System.out.println("CoureseController");

		List list = courseService.getCourseService();// for get(fetch) the value(jsp Page)
		map1.put("list", list);
		if (!map1.containsAttribute("courese")) {
			map1.put("courese", new CourseDto());
		}
		return "coureses";
	}

	@RequestMapping(value = "/coureseSave", method = RequestMethod.POST)
	public String courseCheckSave(@ModelAttribute("courese") CourseDto courseDto, BindingResult result,
			RedirectAttributes redAttri) {
		System.out.println(courseDto.getcName() + "   " + courseDto.getFacalityName());

		courseValidation.validate(courseDto, result);
		// map2.put("courese", new CourseDto());

		if (result.hasErrors()) {
			System.out.println("Errorrr");
			redAttri.addFlashAttribute("org.springframework.validation.BindingResult.courese", result);
			redAttri.addFlashAttribute("courese", courseDto);
			return "redirect:/CourseForm.do";
		} else {
			courseService.courseOfServiceSave(courseDto);// For Save the value
			return "redirect:/CourseForm.do";
		}

	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String DeleteContriller(CourseDto courseDto, HttpServletRequest req, HttpServletResponse res) {
		String cid = req.getParameter("id");
		int ids = Integer.parseInt(cid);
		System.out.println("project Id is " + "    " + ids);
		courseService.deleteService(ids);// For Delete
		return "redirect:/CourseForm.do";
	}

	/*@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String UpdateController(@ModelAttribute("courese") CourseDto courseDto, HttpServletRequest req,
			HttpServletResponse res) {
		System.out.println("UpdateContriller");
		return "redirect:/CourseForm.do";
	}*/

	// For Course update JSP Get Method
	@RequestMapping(value = "/CourseEdit", method = RequestMethod.GET)
	public String UpdateConShow(Map map, ModelMap modelMap, HttpServletRequest req) {
		map.put("edit", new CourseDto());
		List<CourseDto> list = (List<CourseDto>) courseService.updateService(Integer.valueOf(req.getParameter("id")));
		modelMap.put("list1", list);

		System.out.println("In Update Controller");
		return "CourseEdit";
	}

	//// For Course Update JSP Post Method
	@RequestMapping(value = "/editUrl", method = RequestMethod.POST)
	public String editCheck(@ModelAttribute("edit") CourseDto courseDto, ModelMap map1) {

		System.out.println("in side the editCheck");
		courseService.UpdateValveService(courseDto);
		return "redirect:/CourseForm.do";
	}
}
