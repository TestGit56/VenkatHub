package com.org.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRACTEMPLOYEETPS")
@PrimaryKeyJoinColumn(name = "EMP_FK_ID")
public class ContractEmployee extends Employee{
	
	@Column(name = "CONTRACTPERIOD")
	private String ContractPeriod=null;
	
	@Column(name = "PAYPERHOUR")
	private Float PayPerHour=null;

	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(Integer empId, String empName, String contractPeriod, Float payPerHour) {
		setEmpId(empId);
		setEmpName(empName);
		
		ContractPeriod = contractPeriod;
		PayPerHour = payPerHour;
	}

	public String getContractPeriod() {
		return ContractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		ContractPeriod = contractPeriod;
	}

	public Float getPayPerHour() {
		return PayPerHour;
	}

	public void setPayPerHour(Float payPerHour) {
		PayPerHour = payPerHour;
	}

	@Override
	public String toString() {
		return "ContractEmployee [ContractPeriod=" + ContractPeriod + ", PayPerHour=" + PayPerHour + "]";
	}
	
	
	
	
	
	
	
	

}
