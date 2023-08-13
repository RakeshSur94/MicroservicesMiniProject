package com.nt.exception;

public class IPLTeamNotFoundException extends RuntimeException {
	public IPLTeamNotFoundException() {
		
	}
	public IPLTeamNotFoundException(String mssg) {
		super(mssg);
	}

}
