package com.empservices.EmployeeServices.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.empservices.EmployeeServices.Model.TimeCard;
import com.empservices.EmployeeServices.dao.TimeCarddao;

@RestController
public class TimeCardController {
	
	@Autowired
	TimeCarddao tcd;
	
	@RequestMapping (value = "/timecard/add", method = RequestMethod.POST)
	public String addtimecard(@RequestBody TimeCard tc) {
		return tcd.addnew(tc);
	}
	
	@RequestMapping (value = "/timecard/showAll")
	public List<TimeCard> showAll() {
		return tcd.findAll();
	}

	@RequestMapping (value = "/timecard/showbyId")
	public Optional<TimeCard> showbyId (@RequestBody TimeCard tc) {
		return tcd.findbyId(tc);
	}

	@RequestMapping (value = "/timecard/update", method = RequestMethod.POST)
	public String updatetimecard(@RequestBody TimeCard tc) {
		return tcd.update(tc);
	}

	@RequestMapping (value = "/timecard/delete", method = RequestMethod.POST)
	public String deletetimecard(@RequestBody TimeCard tc) {
		return tcd.delete(tc);
	}	
}
