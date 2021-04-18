package com.empservices.EmployeeServices.dao;

import org.springframework.data.repository.CrudRepository;

import com.empservices.EmployeeServices.Model.Employee;

public interface EmployeeRepo extends CrudRepository <Employee, Integer> {
	
	

}
