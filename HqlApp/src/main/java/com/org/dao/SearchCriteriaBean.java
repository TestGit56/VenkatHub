package com.org.dao;

public class SearchCriteriaBean {

	
	private Integer empId=null;
	private String empName=null;
	
	public SearchCriteriaBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchCriteriaBean(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
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

	@Override
	public String toString() {
		return "SearchCriteriaBean [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
