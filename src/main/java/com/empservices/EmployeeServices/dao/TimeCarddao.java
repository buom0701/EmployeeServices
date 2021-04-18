package com.empservices.EmployeeServices.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empservices.EmployeeServices.Model.TimeCard;

@Service
public class TimeCarddao {
	
	@Autowired
	TimeCardRepo tr;
	
	
	// Create
	public String addnew(TimeCard tc) {
		tr.save(tc);
		return "New timecard added";
	}
	
	// Read
	public List<TimeCard> findAll() {
		return (List<TimeCard>) tr.findAll();
	}

	// Read
	public Optional<TimeCard> findbyId (TimeCard tc) {
		return tr.findById(tc.getTimecardid());
	}
	
	// Update
	public String update(TimeCard tc) {
		tr.save(tc);
		return "New timecard updated";
	}

	// Delete
	public String delete(TimeCard tc) {
		tr.deleteById(tc.getTimecardid());
		return "New timecard deleted";
	}

	
}
