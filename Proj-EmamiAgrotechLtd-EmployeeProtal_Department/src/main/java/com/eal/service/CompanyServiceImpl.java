package com.eal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eal.exception.CompanyNotFoundException;
import com.eal.model.Company;
import com.eal.repository.ICompanyRepository;

import lombok.extern.slf4j.Slf4j;
@Service("company_Service")
@Slf4j
public class CompanyServiceImpl implements ICompanyService {

	@Autowired
	private ICompanyRepository companyRepo;
	@Override
	public String registerCompany(Company company) {
		log.info("Company Register operation started");
		int idValue=companyRepo.save(company).getCId();
		log.info("Company Registration sucessfully Done wtih id "+idValue);
		return "Company Registered with ID "+idValue;
	}

	@Override
	public List<Company> fetchAllCompanyList() {
		log.info("List of Company Fetch Opertion Started");
		return null;
	}

	@Override
	public Company fetchCompanyById(int id) {
		return companyRepo.findById(id).orElseThrow(()-> new CompanyNotFoundException("Invalid Company Id"));
	}

}
