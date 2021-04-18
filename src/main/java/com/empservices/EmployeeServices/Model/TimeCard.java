package com.empservices.EmployeeServices.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "TIMECARD")
public class TimeCard {
			
	@Id
	@GeneratedValue
	@Column
	private int timecardid;
	@Column
	private String date;
	@Column
	private String in;
	@Column
	private String out;
	
	@ManyToOne
	@JoinColumn(name = "Emp_Id", referencedColumnName = "Id")
	private Employee employee;
	
	
	public int getTimecardid() {
		return timecardid;
	}
	public void setTimecardid(int timecardid) {
		this.timecardid = timecardid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getIn() {
		return in;
	}
	public void setIn(String in) {
		this.in = in;
	}
	public String getOut() {
		return out;
	}
	public void setOut(String out) {
		this.out = out;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
