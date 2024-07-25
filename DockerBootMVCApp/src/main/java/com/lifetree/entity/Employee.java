package com.lifetree.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="EMP_TABLE")
public class Employee {

	@Id
	@GeneratedValue
	private Integer eId;
	
	@Column
	private String name;
	
	@Column
	private String gender;
	
}
