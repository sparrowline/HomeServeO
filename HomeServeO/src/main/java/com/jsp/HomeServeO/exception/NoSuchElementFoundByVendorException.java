package com.jsp.HomeServeO.exception;

import lombok.Data;

@Data
public class NoSuchElementFoundByVendorException extends RuntimeException{
	
	private String msg="No such element found";

	public NoSuchElementFoundByVendorException(String msg) {
		super();
		this.msg = msg;
	}

	public NoSuchElementFoundByVendorException() {
		super();
	}
	
	

}
