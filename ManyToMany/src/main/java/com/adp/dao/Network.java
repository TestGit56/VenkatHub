package com.adp.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NETWORK")
public class Network {
	
	@Id
	@Column(name = "NETWORK_ID")
	private Integer networkId=null;
    
	@Column(name = "NETWORK_NAME")
	private String networkName=null;

	public Network() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Network(Integer networkId, String networkName) {
		super();
		this.networkId = networkId;
		this.networkName = networkName;
	}

	public Integer getNetworkId() {
		return networkId;
	}

	public void setNetworkId(Integer networkId) {
		this.networkId = networkId;
	}

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	

}
