package com.nv.service;

import java.util.List;

import com.nv.model.Student;

public interface IStudentService 
{
	//method for selecting all Student
	public List<Student> fetchAllStudent();

}