package com.nv.service;

import java.util.List;

import com.nv.model.Student;

public interface IStudentService 
{
	//method for selecting all Student
	public List<Student> fetchAllStudent();
	
	//method for add Student
	
	public String registerStudent(Student stu);
	
	//for finding perticular student
	
	public Student getStudentByNo(int no);
	
	// for edit student
	
	public String updateStudent(Student stu);
	
	//for delete student data
	
	public String deleteStudentByNo(int sno);

}
