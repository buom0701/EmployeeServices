package com.empservices.EmployeeServices.Model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	
	@javax.persistence.Id
	@Column
	private int Id;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String jobtitle;
	
//	@OneToMany(
//			
//			//mappedBy = "employee",
////			targetEntity = TimeCard.class,
////			cascade = CascadeType.ALL
//			//orphanRemoval = true
//			)
//	//@JoinColumn(name = "emp_id", referencedColumnName = "Id" )
//	private List<TimeCard> timecard;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
//	public List<TimeCard> getTimecard() {
//		return timecard;
//	}
//	public void setTimecard(List<TimeCard> timecard) {
//		this.timecard = timecard;
//	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	
	
}
