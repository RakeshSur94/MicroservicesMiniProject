package com.eal.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="COMPANY_DETAILS")
@Getter
@Setter
@RequiredArgsConstructor
public class Company implements Serializable {
	
	private Integer cId;
	@NonNull
	@Column(name = "COMPANY_NAME",length = 25)
	private String cname;
	@NonNull
	@Column(name = "COMPANY_LOCATION",length = 25)
	private String cLocation;
	@Override
	public String toString() {
		return "Company [cId=" + cId + ", cname=" + cname + ", cLocation=" + cLocation + "]";
	}
	public Company() {
		System.out.println("Company.Company()");
	}
	
	
	
	
	

}
