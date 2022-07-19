package com.greatLearning.employeeMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.employeeMS.entity.Role;



public interface RoleRepository  extends JpaRepository<Role, Integer> {

}
