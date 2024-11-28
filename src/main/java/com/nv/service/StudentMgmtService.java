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
	
	//1:Select
	@Override
	public List<Student> fetchAllStudent()
	{
		return StuRepo.findAll();
	}
	
	//2:Insert
	@Override
	public String registerStudent(Student stu) 
	{
		
		return "Student Register with Sno::"+StuRepo.save(stu).getSno();
	}
	
	//3:getById
	@Override
	public Student getStudentByNo(int no)
	{
		return StuRepo.getReferenceById(no);
	}

	@Override
	public String updateStudent(Student stu) 
	{
		
		return StuRepo.save(stu).getSno()+"Student data updated::";
	}

	@Override
	public String deleteStudentByNo(int sno) 
	{
		StuRepo.deleteById(sno);
		return sno+"deletend";
	}

}
