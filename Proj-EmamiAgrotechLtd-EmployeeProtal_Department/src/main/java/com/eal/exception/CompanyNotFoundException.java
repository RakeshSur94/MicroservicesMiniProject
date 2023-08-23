package com.eal.exception;

public class CompanyNotFoundException extends RuntimeException {
	
	public CompanyNotFoundException() {
		System.out.println("CompanyNotFoundException.CompanyNotFoundException()");
	}
	public CompanyNotFoundException(String mssg) {
		super(mssg);
	}

}
