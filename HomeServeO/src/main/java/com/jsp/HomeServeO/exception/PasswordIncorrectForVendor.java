package com.jsp.HomeServeO.exception;

import lombok.Data;

@Data
public class PasswordIncorrectForVendor extends RuntimeException {

	private String msg = "Wrong password please enter correct one.";

	public PasswordIncorrectForVendor(String msg) {
		super();
		this.msg = msg;
	}

	public PasswordIncorrectForVendor() {
		super();
	}


}
