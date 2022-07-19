package com.greatLearning.employeeMS.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "employee")
public class Employee {

	// define fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotEmpty(message = "employee first name cannot be empty")
	private String firstName;

	@NotEmpty(message = "employee first name cannot be empty")
	private String lastName;

	@Email(message = "not a valid email address")
	private String email;
	
}
