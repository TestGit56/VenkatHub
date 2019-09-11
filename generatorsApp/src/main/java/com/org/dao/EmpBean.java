package com.org.dao;

import java.io.Serializable;

public class EmpBean implements Serializable{
	
	private Integer empId=null;
	private String empName=null;
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
	
	


