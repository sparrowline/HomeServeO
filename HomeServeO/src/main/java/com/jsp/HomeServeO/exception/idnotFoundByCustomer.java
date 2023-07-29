package com.jsp.HomeServeO.exception;

import lombok.Data;

@Data
public class idnotFoundByCustomer extends RuntimeException {
	
	private String msg="hlo";

	public idnotFoundByCustomer(String msg) {
		super();
		this.msg = msg;
	}
	

}
