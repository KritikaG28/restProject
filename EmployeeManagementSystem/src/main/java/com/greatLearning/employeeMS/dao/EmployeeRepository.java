package com.greatLearning.employeeMS.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.employeeMS.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameAsc();

}
