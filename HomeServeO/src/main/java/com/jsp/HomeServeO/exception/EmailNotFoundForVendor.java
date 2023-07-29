package com.jsp.HomeServeO.exception;

import lombok.Data;

@Data
public class EmailNotFoundForVendor extends RuntimeException {
	
	private String msg = "Email not found please register first or enter correct email";

	public EmailNotFoundForVendor(String msg) {
		super();
		this.msg = msg;
	}

	public EmailNotFoundForVendor() {
		super();
	}
	
	

}
