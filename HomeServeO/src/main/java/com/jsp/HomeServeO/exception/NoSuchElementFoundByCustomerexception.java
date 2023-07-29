package com.jsp.HomeServeO.exception;

import lombok.Data;

@Data
public class NoSuchElementFoundByCustomerexception extends RuntimeException {
	
	private String msg =" No such element found!";

	public NoSuchElementFoundByCustomerexception(String msg) {
		super();
		this.msg = msg;
	}

	public NoSuchElementFoundByCustomerexception() {
		super();
	}
	

}
