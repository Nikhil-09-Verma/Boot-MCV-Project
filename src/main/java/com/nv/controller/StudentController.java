package com.nv.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//for show editing student record
	
	@GetMapping("/edit")
	public String showEditFrom(@RequestParam("no") int no,@ModelAttribute("stu") Student stu) 
	{
		//get Student object
		Student st1= stuService.getStudentByNo(no);
		//copy that object to modelAttributr so we can lunch form with old value
		BeanUtils.copyProperties(st1, stu);
		
		return "edit_form";
	}
	
	@PostMapping("/edit")
	public String editStudent(@ModelAttribute("stu") Student stu,RedirectAttributes atts) 
	{
		String msg= stuService.updateStudent(stu);
		
		atts.addFlashAttribute("resultMsg",msg);
		return "redirect:report";
	}
	
	//deleting data
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("no") int no,RedirectAttributes atts) 
	{
		String msg= stuService.deleteStudentByNo(no);
		atts.addFlashAttribute("resultMsg",msg);
		
		return "redirect:report";
		
	}

}
