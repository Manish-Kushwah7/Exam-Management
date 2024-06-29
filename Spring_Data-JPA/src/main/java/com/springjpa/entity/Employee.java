package com.springjpa.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="emp_table3")
public class Employee {


	@Override
	public String toString() {
		return "\n  ===>> Employee [empid=" + empid + ", emp_salary=" + salary + ", empgender=" + empgender + ", empname="
				+ empname + "]\n";
	}

	



	@Id
private Integer empid;
private Double salary;
private String empgender;
private String empname;


public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public Integer getEmpid() {
	return empid;
}
public void setEmpid(Integer empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpgender() {
	return empgender;
}
public void setEmpgender(String empgender) {
	this.empgender = empgender;
}


}
