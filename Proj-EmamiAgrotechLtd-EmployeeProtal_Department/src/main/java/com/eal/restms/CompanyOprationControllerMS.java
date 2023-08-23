package com.eal.restms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eal.model.Company;
import com.eal.service.ICompanyService;

@RestController
@RequestMapping("/comp-api")
public class CompanyOprationControllerMS {
	@Autowired
	private ICompanyService companyService;
	
	@PostMapping("/save")
	public ResponseEntity<?> registerAllCompanyInfo(@RequestBody Company company){
		String save=companyService.registerCompany(company);
		return new ResponseEntity<String>(save, HttpStatus.CREATED);
	}
	@GetMapping("/fetch")
	public ResponseEntity<?> getAllCompanyInformation(){
		List<Company> list=companyService.fetchAllCompanyList();
		return new ResponseEntity<List<Company>>(list, HttpStatus.OK);
	}
	@GetMapping("/fetchbyId/{id}")
	public ResponseEntity<?> getCompanyDetailsById(@PathVariable("id")int id){
		return new ResponseEntity<Company>(companyService.fetchCompanyById(id), HttpStatus.OK);
	}

}
