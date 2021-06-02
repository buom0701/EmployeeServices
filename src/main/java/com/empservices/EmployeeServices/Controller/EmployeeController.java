package com.empservices.EmployeeServices.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.empservices.EmployeeServices.Model.Employee;
import com.empservices.EmployeeServices.dao.EmployeeRepo;
import com.empservices.EmployeeServices.dao.Employeedao;

@RestController
public class EmployeeController {
	
	@Autowired
	Employeedao es;
	
	@Autowired
	EmployeeRepo ep;
	
	@RequestMapping(value = "/")
	public String welcome() {
		return "Welcome Home";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String Addemployee(@RequestBody Employee emp) {
//		System.out.println(employee.getFirstname());
		return es.saveEmployee(emp);
	}
	@RequestMapping(value = "/showAll")
		public List<Employee> showAll() {
		return es.findall();
}
	@RequestMapping(value = "/findemp")
	public Optional<Employee> findbyId(@RequestBody Employee emp) {
		return es.findbyId(emp);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Updateemployee(@RequestBody Employee emp) {
		return es.updateEmployee(emp);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteemployee(@RequestBody Employee emp) {
		return es.deleteEmployee(emp);
	}
}
