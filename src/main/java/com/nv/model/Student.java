package com.nv.model;

import java.io.Serializable;
import org.hibernate.annotations.SQLRestriction;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

//model / entity class
@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "student_info")
@org.hibernate.annotations.SQLDelete(sql = "update student_info set status='deleted' where sno=?") // for soft delete
@SQLRestriction(value = "status <>'deleted' ")
public class Student implements Serializable {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "stu_seq_gen", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer sno;
	private String sname;
	private String course = "java";
	private Double fee;
	private String status = "active";
	private String country;
	
}
