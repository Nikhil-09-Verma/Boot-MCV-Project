package com.nv.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nv.model.Student;
import com.nv.service.IStudentService;

@Controller
public class StudentController 
{
	@Autowired
	private IStudentService stuService;
	
	
	//for showing home page
	@GetMapping("/")
	public String showHome()
	{
		return "welcome";
	}
	
	
	//for showing all Student 
	@GetMapping("/report")
	public String showReport(Map<String,Object> map) 
	{
		List<Student>list=stuService.fetchAllStudent();
		map.put("StuList", list);
		
		System.out.println(list);
		return "show_report";
			
	}
	
	
	//for showing registration form
	@GetMapping("/register")
	public String showRegisterStudent(@ModelAttribute("stu")Student s1)
	{
		return "registration_form";
	}
	
	
	//for saving data into database 
	@PostMapping("/register")
	public String registetStudent(@ModelAttribute("stu") Student s1,RedirectAttributes atts) 
	{
		String msg= stuService.registerStudent(s1);
		atts.addFlashAttribute("resultMsg",msg);
		return "redirect:report";
	}

}
