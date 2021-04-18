package com.empservices.EmployeeServices.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.empservices.EmployeeServices.Model.Employee;

@Service
public class Employeedao {
	
	@Autowired
	EmployeeRepo ep;
	
	//Adds new Employee record (Create)
	public String saveEmployee(Employee emp) {
		ep.save(emp);
		return "Employee saved!";
	}
	
	//Returns All Employees (Read)
	public List <Employee> findall() {
		return (List<Employee>) ep.findAll();
	}
	
	//Returns by Id (Read)
	public Optional<Employee> findbyId(Employee emp) {
		return ep.findById(emp.getId());
		}
	
		//Adds new Employee record (Update)
	public String updateEmployee(Employee emp) {
		ep.save(emp);
		return "Employee updated";
		}
		
		//Deletes Employee record (Update)
	public String deleteEmployee(Employee emp) {
		ep.deleteById(emp.getId());
		return "Employee deleted";
				}
				
}
