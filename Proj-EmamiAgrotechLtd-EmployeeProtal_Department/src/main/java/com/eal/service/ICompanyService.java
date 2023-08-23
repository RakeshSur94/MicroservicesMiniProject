package com.eal.service;

import java.util.List;

import com.eal.model.Company;

public interface ICompanyService {
	public String registerCompany(Company company);
	public List<Company> fetchAllCompanyList();
	public Company fetchCompanyById(int id);

}
