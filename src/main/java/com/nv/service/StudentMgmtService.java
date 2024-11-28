package com.nv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.model.Student;
import com.nv.repositry.IStudentRepo;
@Service
public class StudentMgmtService implements IStudentService
{

	@Autowired
	private IStudentRepo StuRepo;
	@Override
	public List<Student> fetchAllStudent()
	{
		return StuRepo.findAll();
	}

}
