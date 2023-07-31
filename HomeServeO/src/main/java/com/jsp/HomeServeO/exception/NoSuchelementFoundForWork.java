package com.jsp.HomeServeO.exception;

import lombok.Data;

@Data
public class NoSuchelementFoundForWork extends RuntimeException {

	private String msg="no particular id found to  be updated in Works";

	public NoSuchelementFoundForWork(String msg) {
		super();
		this.msg = msg;
	}

	public NoSuchelementFoundForWork() {
		super();
	}
	
	
}
