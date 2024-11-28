package com.nv.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nv.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {

}
