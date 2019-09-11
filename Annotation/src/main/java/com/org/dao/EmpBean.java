package com.org.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Employee")

public class EmpBean implements Serializable {
	
	@Id
	@GenericGenerator(name="icr", strategy="increment")
	@GeneratedValue(generator="icr")
	@Column(name="EMPID")
	
	
	private Integer empId=null;
	
	@Column(name="EMPNAME")
	
	private String empName=null;
	
	@Column(name="EMPSAL")
	
	private Float empSal=null;

	public EmpBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpBean(String empName, Float empSal) {
		super();
		this.empName = empName;
		this.empSal = empSal;
	}

	public EmpBean(Integer empId, String empName, Float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Float empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "EmpBean [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	

}
