package com.empservices.EmployeeServices.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.empservices.EmployeeServices.Model.TimeCard;

public interface TimeCardRepo extends CrudRepository <TimeCard, Integer> {
	

}
