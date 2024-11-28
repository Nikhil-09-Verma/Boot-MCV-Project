package com.nv.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

//model com entity class
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="student_master")
public class Student implements Serializable
{

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "stu_seq_gen",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType .SEQUENCE)
	private Integer sno;
	private String sname;
	private String course="java";
	private Double fee;
	
}
