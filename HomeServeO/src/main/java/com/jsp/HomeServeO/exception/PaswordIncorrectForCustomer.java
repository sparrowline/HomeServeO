package com.jsp.HomeServeO.exception;

import lombok.Data;

@Data
public class PaswordIncorrectForCustomer extends RuntimeException {
	
	private String msg = "Incorrect password please enter correct password";

	public PaswordIncorrectForCustomer() {
		super();
	}

	public PaswordIncorrectForCustomer(String msg) {
		super();
		this.msg = msg;
	}
	
	
	

}
