package com.jsp.HomeServeO.exception;

import lombok.Data;

@Data
public class idnotFoundByCustomer extends RuntimeException {
	
	private String message="hlo";

	public idnotFoundByCustomer(String message) {
		super();
		this.message = message;
	}
	

}
